package application.service.product;

import application.configuration.AppProperties;
import application.persistence.entity.AbstractFile;
import application.persistence.entity.ImageFile;
import application.persistence.repository.ImageFileRepository;
import application.rest.domain.AbstractFileDTO;
import application.rest.domain.ImageFileDTO;
import application.service.BaseDatabaseServiceImpl;
import application.service.response.ServiceResponse;
import org.imgscalr.Scalr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by pfilip on 2.3.17.
 */
@Service
public class ImageFileServiceImpl  extends BaseDatabaseServiceImpl<ImageFile, Long, ImageFileRepository, ImageFileDTO> implements ImageFileService<AbstractFile,AbstractFileDTO> {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private ImageFileRepository imageFileRepository;

    @Override
    public ServiceResponse<AbstractFileDTO> create(AbstractFileDTO dto) {
        ImageFileDTO imageFile = new ImageFileDTO();
//        imageFile.setAbstractFileDTO(dto);
        imageFile.setHeight(100);
        imageFile.setWidth(100);
        dto.setImageFileDTO(imageFile);
        return ServiceResponse.success(dto);
    }


    @Override
    public ImageFileRepository getRepository() {
        return imageFileRepository;
    }

//    @Override
//    public
//    String getStoreLocation() {
//        return appProperties.getDocumentStoreLocation();
//    }
//
//    @Override
//    public ServiceResponse create(AbstractFileDTO dto) {
//        return super.create(dto);
//    }
//
//
//    @Override //todo přehodit do jiného vlákna
//    protected void beforeRecordSaved(File file, AbstractFile workingDocumentFile) {
//
//        ImageFile photoFile = (ImageFile) workingDocumentFile;
//        super.beforeRecordSaved(file, workingDocumentFile);
//
//
//        BufferedImage bufferedImage = null;
//
//        try {
//            bufferedImage = ImageIO.read(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (bufferedImage == null) {
//            return;
//        }
//
//        photoFile.setWidth(bufferedImage.getWidth());
//        photoFile.setHeight(bufferedImage.getHeight());
//
//        String structuredDirectoryFromId = getStoreLocation() + FileUtil.getStructuredDirectoryFromId(photoFile.getId());
//        if (!FileUtil.checkOrCreatePathToDirectory(structuredDirectoryFromId)) {
//            throw new RuntimeException("Not possible to reach directory.");
//        }
//        String[] resizeTo = appProperties.getPhotoDefaultResizeTo();
//
//
//        String mimetype = new MimetypesFileTypeMap().getContentType(file);
//        String type = mimetype.split("/")[0];
////        if (!type.equals("image")) {
////            throw new RuntimeException("Not an image");
////        }
//
//
//        for (String newSize : resizeTo) {
//            String width = newSize.split("x")[0];
//            String height = newSize.split("x")[1];
//            BufferedImage resizedCopy = createResizedCopy(bufferedImage, Integer.valueOf(width), Integer.valueOf(height));
//
//            String filePath = structuredDirectoryFromId + "/" + newSize + "-" + photoFile.getId();
//            File outputFile = new File(filePath);
//            try {
//                String extension = StringUtils.substringAfter(workingDocumentFile.getFileName(), ".");
//                ImageIO.write(resizedCopy, extension, outputFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
    @Override
    public boolean createResizedCopyAndSave(String pathToOrigin, String extension, int width, int height) {
        BufferedImage bufferedImage = null;

        File file = new File(pathToOrigin);
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedImage == null) {
            return false;
        }

        BufferedImage resizedCopy = createResizedCopy(bufferedImage, width, height);
        String extensionDashed = "";
        if (extension != null) {
            extensionDashed = extension + "-";
        }
        String filePath = file.getParentFile() + "/" + width + "x" + height + "-"+ extensionDashed + file.getName();
        File outputFile = new File(filePath);
        try {
            ImageIO.write(resizedCopy, extension, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean createCopyAndSave(String pathToOrigin, String extension) {
        BufferedImage bufferedImage = null;

        File file = new File(pathToOrigin);
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedImage == null) {
            return false;
        }

        String extensionDashed = "";
        if (extension != null) {
            extensionDashed = extension + "-";
        }
        String filePath = file.getParentFile() + "/"+ extensionDashed + file.getName();
        File outputFile = new File(filePath);
        try {
            ImageIO.write(bufferedImage, extension, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    private BufferedImage createResizedCopy(BufferedImage inputImage, int width, int height) {
        return Scalr.resize(inputImage, Scalr.Method.QUALITY, width, height, Scalr.OP_ANTIALIAS);
    }

    private BufferedImage cropImage(BufferedImage inputImage, int x, int y, int w, int h) {
        return inputImage.getSubimage(x, y, w, h);
    }
}
