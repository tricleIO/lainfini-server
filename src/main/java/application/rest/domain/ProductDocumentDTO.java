package application.rest.domain;

import application.persistence.entity.ProductDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDocumentDTO extends AbstractProductFileDTO<ProductDocument> {

    @Override
    public ProductDocument toEntity() { //todo, bude záležet, co budeme vracet
        ProductDocument productDocument = new ProductDocument();
        productDocument.setFileName(fileName);
        productDocument.setIndex(fileIndex);
        productDocument.setFileDescription(fileDescription);
        productDocument.setFileStatus(fileStatus);
        return productDocument;
    }

    @Override
    public void addLinks() {

    }
}
