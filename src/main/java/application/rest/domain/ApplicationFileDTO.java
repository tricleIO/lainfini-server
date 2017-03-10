package application.rest.domain;

import application.persistence.entity.ApplicationFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationFileDTO extends AbstractFileDTO<ApplicationFile> {

    @Override
    public ApplicationFile toEntity() {
        ApplicationFile applicationFile = new ApplicationFile();
        applicationFile.setId(uid);
        applicationFile.setFileName(fileName);
        applicationFile.setIndex(fileIndex);
        applicationFile.setMimeType(mimeType);
        applicationFile.setFileDescription(fileDescription);
        applicationFile.setFileStatus(fileStatus);
        return  applicationFile;
    }

    @Override
    public void addLinks() {

    }
}
