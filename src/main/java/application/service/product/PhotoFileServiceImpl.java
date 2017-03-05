package application.service.product;

import application.configuration.AppProperties;
import application.persistence.entity.PhotoFile;
import application.persistence.repository.PhotoFileRepository;
import application.rest.domain.PhotoFileDTO;
import application.util.FileUtil;
import org.imgscalr.Scalr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by pfilip on 2.3.17.
 */
@Service
public class PhotoFileServiceImpl extends AbstractFileServiceImpl<PhotoFile, PhotoFileRepository, PhotoFileDTO> implements PhotoFileService {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private PhotoFileRepository photoFileRepository;

    @Override
    public PhotoFileRepository getRepository() {
        return photoFileRepository;
    }

    @Override
    public
    String getStoreLocation() {
        return appProperties.getPhotoStoreLocation();
    }

    @Override
    protected void beforeRecordSaved(File file, PhotoFile workingDocumentFile) {

        BufferedImage bufferedImage = null;

        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedImage == null) {
            return;
        }

        workingDocumentFile.setWidth(bufferedImage.getWidth());
        workingDocumentFile.setHeight(bufferedImage.getHeight());

        String structuredDirectoryFromId = getStoreLocation() + FileUtil.getStructuredDirectoryFromId(workingDocumentFile.getId());
        if (!FileUtil.checkOrCreatePathToDirectory(structuredDirectoryFromId)) {
            throw new RuntimeException("Not possible to reach directory.");
        }
        String[] resizeTo = appProperties.getPhotoDefaultResizeTo();


        String mimetype = new MimetypesFileTypeMap().getContentType(file);
        String type = mimetype.split("/")[0];
        if (!type.equals("image")) {
            throw new RuntimeException("Not an image");
        }


        for (String newSize : resizeTo) {
            String width = newSize.split("x")[0];
            String height = newSize.split("x")[1];
            BufferedImage resizedCopy = createResizedCopy(bufferedImage, Integer.valueOf(width), Integer.valueOf(height));

            String filePath = structuredDirectoryFromId + "/" + newSize + "-" + workingDocumentFile.getFileName();
            File outputfile = new File(filePath);
            try {
                ImageIO.write(resizedCopy, "jpg", outputfile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


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
        String filePath = file.getParentFile() + "/" + width + "x" + height + "-" + file.getName();
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

        String filePath = file.getParentFile() + "/" + file.getName();
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
