package application.rest.domain;

import application.persistence.entity.ApplicationFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@EqualsAndHashCode(exclude = "imageFileDTO",callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationFileDTO extends AbstractFileDTO<ApplicationFile> {

    protected Set<ProductDTO> products;

    @Override
    public ApplicationFile toEntity(boolean selectAsParent, Object... parentParams) {
        ApplicationFile applicationFile = new ApplicationFile();
        applicationFile.setId(uid);
        applicationFile.setFileName(fileName);
        applicationFile.setIndex(fileIndex);
        applicationFile.setMimeType(mimeType);
        applicationFile.setFileDescription(fileDescription);
        applicationFile.setFileStatus(fileStatus);
        applicationFile.setFile(getFile());
        if (selectAsParent && imageFileDTO != null && imageFileDTO.getAbstractFileDTO() != null) {
            applicationFile.setImageFile(imageFileDTO.toEntity(false, applicationFile));
        }
        return  applicationFile;
    }

    @Override
    public void addLinks() {

    }
}
