package application.rest;

import application.persistence.entity.AbstractFile;
import application.persistence.entity.PhotoFile;
import application.rest.domain.PhotoFileDTO;
import application.service.product.PhotoFileService;
import application.service.response.ServiceResponse;
import application.util.FileUtil;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
@RestController
@RequestMapping(value = "/photos")
public class PhotoFileController extends AbstractDatabaseController<PhotoFile, Long, PhotoFileDTO, PhotoFileService> {

    @Autowired
    private PhotoFileService photoFileService;

    /**
     * upload images
     * @param files
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> uploadPhotos(@RequestParam("file") MultipartFile[]  files ) {
        List<PhotoFileDTO> documentFileDTOS = new ArrayList<>();
        for (MultipartFile file : files) {

            PhotoFileDTO photoFileDTO = new PhotoFileDTO();
            photoFileDTO.setFileName(file.getOriginalFilename());
            photoFileDTO.setFile(file);
            ServiceResponse<PhotoFileDTO> productDocumentDTOServiceResponse = photoFileService.create(photoFileDTO);
            documentFileDTOS.add(productDocumentDTOServiceResponse.getBody());
        }
        return new ResponseEntity(documentFileDTOS, HttpStatus.OK);
    }

    /**
     * upload images to product
     * @param files
     * @return
     */
    @RequestMapping(value = "/product/{productId}", method = RequestMethod.POST)
    public ResponseEntity<?> uploadPhotosToProduct(@PathVariable Long productId, @RequestParam("file") MultipartFile[]  files ) {
        List<PhotoFileDTO> documentFileDTOS = new ArrayList<>();
        for (MultipartFile file : files) {

            PhotoFileDTO photoFileDTO = new PhotoFileDTO();
            photoFileDTO.setFileName(file.getOriginalFilename());
            photoFileDTO.setFile(file);
            ServiceResponse<PhotoFileDTO> productDocumentDTOServiceResponse = photoFileService.create(photoFileDTO);
            documentFileDTOS.add(productDocumentDTOServiceResponse.getBody());
        }
        return new ResponseEntity(documentFileDTOS, HttpStatus.OK);
    }

    /**
     * Get information about image as JSON
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getFile(@PathVariable UUID id)  {
        ResponseEntity<?> byIndex = photoFileService.findByIndex(id);

        return byIndex;
    }


    /**
     * Get image as media
     * @param id
     * @param extension
     * @param width
     * @param height
     * @param response
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping(value = "/{id}.{extension}", method = RequestMethod.GET)
    public byte[] getFileInResolution(@PathVariable UUID id, @PathVariable String extension, @RequestParam(required = false) Integer width, @RequestParam(required = false) Integer height, HttpServletResponse response) throws UnsupportedEncodingException {
        ResponseEntity<?> byIndex = photoFileService.findByIndex(id);
        Long id1 = ((AbstractFile) byIndex.getBody()).getId();
        String structuredDirectoryFromId = photoFileService.getStoreLocation() + FileUtil.getStructuredDirectoryFromId(id1);

        String pathToOrigin = structuredDirectoryFromId + "/" + ((AbstractFile) byIndex.getBody()).getFileName();

        String size = "";
        if (width != null && height != null) {
            size = width + "x" + height + "-";
        }

        String filename = ((AbstractFile) byIndex.getBody()).getFileName();
        filename = filename.substring(0, filename.lastIndexOf('.')) +"." + extension;

        String pathToThumbnail = structuredDirectoryFromId + "/" + size + filename;
        File file = new File(pathToThumbnail);
        if (!file.exists() && width != null && height != null) {
            photoFileService.createResizedCopyAndSave(pathToOrigin, extension, width, height);
            file = new File(pathToThumbnail);
        } else if (!file.exists()) {
            photoFileService.createCopyAndSave(pathToOrigin, extension);
            file = new File(pathToThumbnail);
        }

        try {
            Path path = Paths.get(pathToThumbnail);
            String mimeType = Files.probeContentType(path);
            response.setContentType(mimeType);
            response.setContentLength(Math.toIntExact(file.length()));
            response.setHeader("Content-Disposition", "inline; filename=" + file.getName());
            IOUtils.copy(new FileInputStream(file), response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PhotoFileService getBaseService() {
        return photoFileService;
    }
}
