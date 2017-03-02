package application.rest.domain;

import application.persistence.entity.DocumentFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentFileDTO extends AbstractProductFileDTO<DocumentFile> {

    @Override
    public DocumentFile toEntity() { //todo, bude záležet, co budeme vracet
        DocumentFile documentFile = new DocumentFile();
        documentFile.setFileName(fileName);
        documentFile.setIndex(fileIndex);
        documentFile.setFileDescription(fileDescription);
        documentFile.setFileStatus(fileStatus);
        return documentFile;
    }

    @Override
    public void addLinks() {

    }
}
