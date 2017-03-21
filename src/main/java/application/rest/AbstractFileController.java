package application.rest;

import application.persistence.entity.AbstractFile;
import application.rest.domain.AbstractFileDTO;
import application.service.product.AbstractFileService;
import application.service.product.ImageFileService;
import application.service.response.ServiceResponse;
import application.util.FileUtil;
import lombok.Data;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractFileController<E extends AbstractFile<D>, D extends AbstractFileDTO<E>, S extends AbstractFileService<E, D>> extends AbstractDatabaseController<E, Long, D, S> {

    public abstract Class<D> getDTOClazz();


    @Autowired
    private ImageFileService imageFileService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> readAllFiles(Pageable pageable) {
        return readAll(pageable);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> uploadDocument(@RequestParam("file") MultipartFile[] files) throws IllegalAccessException, InstantiationException {
        List<D> applicationFileDTOS = new ArrayList<>();
        for (MultipartFile file : files) {
            D body = fileUploadProcess(file);
            applicationFileDTOS.add(body);
        }
        return new ResponseEntity(applicationFileDTOS, HttpStatus.OK);
    }

    public D fileUploadProcess(MultipartFile file) throws InstantiationException, IllegalAccessException {
        D abstractFileDTO = getDTOClazz().newInstance();
        abstractFileDTO.setFileName(file.getOriginalFilename());
        abstractFileDTO.setFile(file);
        ServiceResponse<D> productFileDTOServiceResponse;
        if (file.getContentType().startsWith("image/")) {
            abstractFileDTO = (D) imageFileService.create(abstractFileDTO).getBody();
        }

        return getBaseService().create(abstractFileDTO).getBody();
    }

    /**
     * Get file as JSON
     *
     * @param id
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    public ResponseEntity<?> readDocument(@PathVariable UUID id) {
        return new ResponseEntity(getBaseService().findByIndex(id).getBody(), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}.{extension}", method = RequestMethod.GET)
    public byte[] getFile(@PathVariable UUID id, @PathVariable String extension,
                          @RequestParam(required = false) Integer width,
                          @RequestParam(required = false) Integer height,
                          @RequestParam(required = false) boolean asAttachment,
                          HttpServletResponse response) {
        ServiceResponse<?> byIndex = getBaseService().findByIndex(id);
        FileAccessModel fileAccessModel = new FileAccessModel(((D) byIndex.getBody()));

        if (fileAccessModel.getDto().getMimeType() != null && fileAccessModel.getDto().getMimeType().startsWith("image/")) {
            String size = "";
            if (width != null && height != null) {
                size = width + "x" + height + "-";
            }

            String extensionDashed = "";
            if (extension != null && !extension.isEmpty()) {
                extensionDashed = extension + "-";
            }

            String pathToThumbnail = fileAccessModel.getDirectoryStructure() + "/" + size + extensionDashed + fileAccessModel.getDto().getUid();
            File file = new File(pathToThumbnail);
            if (!file.exists()) {
                imageFileService.createResizedCopyAndSave(fileAccessModel.getPathToFile(), extension, width, height);
                new File(pathToThumbnail);
            }
            fileAccessModel.setPathToFile(pathToThumbnail);
        }

        return getFile(fileAccessModel.getPathToFile(), fileAccessModel.getFileName(), asAttachment, response);
    }


    protected byte[] getFile(String pathToFile, String fileName, boolean asAttachment, HttpServletResponse response) {

        try {
            String filePath = pathToFile;
            File file = new File(filePath);
            Path path = Paths.get(filePath);
            String mimeType = Files.probeContentType(path);
            response.setContentType(mimeType);
            response.setContentLength(Math.toIntExact(file.length()));
            if (asAttachment) {
                response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
            } else {
                response.setHeader("Content-Disposition", "inline; filename=" + fileName);
            }
            IOUtils.copy(new FileInputStream(file), response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Data
    public class FileAccessModel implements Serializable {

        private String pathToFile;

        private String fileName;

        private D dto;

        public FileAccessModel(D dto) {
            this.dto = dto;
            this.pathToFile = getDirectoryStructure() + "/" + dto.getUid();
            this.fileName = dto.getFileName();
        }

        public String getDirectoryStructure() {
            return getBaseService().getStoreLocation() + FileUtil.getStructuredDirectoryFromId(dto.getUid());
        }

    }

}