package application.persistence.entity;

import application.rest.domain.ProductDocumentDTO;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@Table(name = "product_document")
public class ProductDocument extends AbstractFile<ProductDocumentDTO> {

    @Override
    public ProductDocumentDTO toDTO() { //todo dodělat
        ProductDocumentDTO productDocumentDTO = new ProductDocumentDTO();
        productDocumentDTO.setUid(getId());
        productDocumentDTO.setFileIndex(getIndex());
        productDocumentDTO.setFileName(getFileName());
        productDocumentDTO.setFileDescription(getFileDescription());
        productDocumentDTO.setFileStatus(getFileStatus());
        return productDocumentDTO;
    }
}
