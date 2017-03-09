package application.rest.domain;

import application.persistence.entity.ApplicationFile;
import application.persistence.entity.ImageFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Set;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationFileDTO extends AbstractFileDTO<ApplicationFile> {

    protected Set<ProductDTO> products;

    @Override
    public ApplicationFile toEntity() {
        ApplicationFile applicationFile = new ApplicationFile();
        applicationFile.setFileName(fileName);
        applicationFile.setIndex(fileIndex);
        applicationFile.setMimeType(mimeType);
        applicationFile.setFileDescription(fileDescription);
        applicationFile.setFileStatus(fileStatus);
        if (imageFileDTO != null) {
            ImageFile imageFile = imageFileDTO.toEntity();
            imageFile.setFile(applicationFile);
            applicationFile.setImageFile(imageFile);
        }
        return  applicationFile;
    }

    @Override
    public void addLinks() {

    }
}
