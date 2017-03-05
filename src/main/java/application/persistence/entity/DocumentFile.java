package application.persistence.entity;

import application.rest.domain.DocumentFileDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@Data
@Table(name = "document_file")
public class DocumentFile extends AbstractFile<DocumentFileDTO> {

    @Override
    public DocumentFileDTO toDTO() { //todo dodělat
        DocumentFileDTO documentFileDTO = new DocumentFileDTO();
        documentFileDTO.setUid(getId());
        documentFileDTO.setFileIndex(getIndex());
        documentFileDTO.setFileName(getFileName());
        documentFileDTO.setFileDescription(getFileDescription());
        documentFileDTO.setFileStatus(getFileStatus());
        return documentFileDTO;
    }
}
