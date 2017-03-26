package application.persistence.entity;

import application.rest.domain.ApplicationFileDTO;
import application.rest.domain.ProductDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pfilip on 2.3.17.
 */
@Entity
@DiscriminatorValue("F")
@Data
@EqualsAndHashCode(exclude = {"productFiles","fileCollection", "fileCollection"},callSuper = true)
public class ApplicationFile extends AbstractFile<ApplicationFileDTO> {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pf.file")
    private Set<ProductFile> productFiles;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fc.file")
    private Set<FileCollectionHasFile> fileCollection;

    @OneToOne(mappedBy = "mainImage")
    private Product product;

    @Override
    public ApplicationFileDTO toDTO(boolean selectAsParent, Object... parentParams) { //todo dodělat
        ApplicationFileDTO applicationFileDTO = new ApplicationFileDTO();
        applicationFileDTO.setUid(getId());
        applicationFileDTO.setFileIndex(getIndex());
        applicationFileDTO.setFileName(getFileName());
        applicationFileDTO.setMimeType(getMimeType());
        applicationFileDTO.setFileTitle(getTitle());
        applicationFileDTO.setFileDescription(getFileDescription());
        applicationFileDTO.setFileStatus(getFileStatus());
        applicationFileDTO.setFile(getFile());
        if (product != null && selectAsParent) {
            applicationFileDTO.setProductDTO(product.toDTO(false));
        }
        if (getImageFile() != null) {
            applicationFileDTO.setImageFileDTO(getImageFile().toDTO(false,applicationFileDTO));
        }

        if (selectAsParent && productFiles != null) {
            HashSet<ProductDTO> productHashSet = new HashSet<>();
            for (ProductFile productFile : productFiles) {
                productHashSet.add(productFile.getPf().getProduct().toDTO(false));
            }
            applicationFileDTO.setProducts(productHashSet);
        }
        return applicationFileDTO;
    }

    @Override
    protected Class<ApplicationFileDTO> getDTOClass() {
        return ApplicationFileDTO.class;
    }

}
