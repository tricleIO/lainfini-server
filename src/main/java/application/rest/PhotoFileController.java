//package application.rest;
//
//import application.persistence.entity.AbstractFile;
//import application.persistence.entity.ImageFile;
//import application.rest.domain.ApplicationFileDTO;
//import application.rest.domain.ImageFileDTO;
//import application.service.product.ImageFileService;
//import application.service.response.ServiceResponse;
//import application.util.FileUtil;
//import org.apache.tomcat.util.http.fileupload.IOUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
///**
// * Created by pfilip on 2.3.17.
// */
//@RestController
//@RequestMapping(value = "/image")
//public class PhotoFileController extends ApplicationFileController {
////
//    @Autowired
//    private ImageFileService photoFileService;
////
////    /**
////     * Get image as media
////     * @param id
////     * @param extension
////     * @param width
////     * @param height
////     * @param response
////     * @return
////     * @throws UnsupportedEncodingException
////     */
//////    @ResponseBody
//////    @RequestMapping(value = "/{id}/{extension}", method = RequestMethod.GET)
////    public byte[] getFileInResolution(@PathVariable UUID id, @PathVariable String extension, @RequestParam(required = true) Integer width, @RequestParam(required = true) Integer height, HttpServletResponse response) throws UnsupportedEncodingException {
////        ServiceResponse<?> byIndex = photoFileService.findByIndex(id);
////        Long id1 = ((ApplicationFileDTO) byIndex.getBody()).getUid();
////        String structuredDirectoryFromId = photoFileService.getStoreLocation() + FileUtil.getStructuredDirectoryFromId(id1);
////
////        String pathToOrigin = structuredDirectoryFromId + "/" + ((AbstractFile) byIndex.getBody()).getFileName();
////
////        String size = "";
////        if (width != null && height != null) {
////            size = width + "x" + height + "-";
////        }
////
////        String filename = ((AbstractFile) byIndex.getBody()).getFileName();
////        filename = filename.substring(0, filename.lastIndexOf('.')) +"." + extension;
////
////        String pathToThumbnail = structuredDirectoryFromId + "/" + size + filename;
////        File file = new File(pathToThumbnail);
////        if (!file.exists() && width != null && height != null) {
////            photoFileService.createResizedCopyAndSave(pathToOrigin, extension, width, height);
////            file = new File(pathToThumbnail);
////        } else if (!file.exists()) {
////            photoFileService.createCopyAndSave(pathToOrigin, extension);
////            file = new File(pathToThumbnail);
////        }
////
////        try {
////            Path path = Paths.get(pathToThumbnail);
////            String mimeType = Files.probeContentType(path);
////            response.setContentType(mimeType);
////            response.setContentLength(Math.toIntExact(file.length()));
////            response.setHeader("Content-Disposition", "inline; filename=" + file.getName());
////            IOUtils.copy(new FileInputStream(file), response.getOutputStream());
////            response.flushBuffer();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return null;
////    }
////
//    @Override
//    public ImageFileService getBaseService() {
//        return photoFileService;
//    }
//}
