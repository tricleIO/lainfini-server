package application.rest.domain;

import application.persistence.entity.ApplicationFile;
import application.rest.ApplicationFileController;
import application.rest.ProductController;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@EqualsAndHashCode(exclude = "imageFileDTO",callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationFileDTO extends AbstractFileDTO<ApplicationFile> implements ReadWriteDatabaseDTO<ApplicationFile>, IdentifableDTO<Long> {

    protected Set<ProductDTO> products;

    @JsonProperty("mainImageOfProduct")
    protected ProductDTO productDTO;

    protected Integer sequenceNumber;

    @Override
    public ApplicationFile toEntity(boolean selectAsParent, Object... parentParams) {
        ApplicationFile applicationFile = new ApplicationFile();
        applicationFile.setId(uid);
        applicationFile.setFileName(fileName);
        applicationFile.setIndex(fileIndex);
        applicationFile.setMimeType(mimeType);
        applicationFile.setTitle(fileTitle);
        applicationFile.setFileDescription(fileDescription);
        applicationFile.setFileStatus(fileStatus);
        applicationFile.setFile(getFile());
        if (productDTO != null) {
            applicationFile.setProduct(productDTO.toEntity(false));
        }
        if (selectAsParent && imageFileDTO != null && imageFileDTO.getAbstractFileDTO() != null) {
            applicationFile.setImageFile(imageFileDTO.toEntity(false, applicationFile));
        }

        return  applicationFile;
    }

    @Override
    public void addLinks() {
        add(linkTo(methodOn(ApplicationFileController.class).readDocument(fileIndex)).withSelfRel());

        if (productDTO != null ) {
            add(linkTo(methodOn(ProductController.class).readProduct(productDTO.getUid(),null)).withRel("product"));
        }

        if (products != null ) {
            add(linkTo(methodOn(ProductController.class).readProductsByImage(uid)).withRel("products"));
        }


    }
}
