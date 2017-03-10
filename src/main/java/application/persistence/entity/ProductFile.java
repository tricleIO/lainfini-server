package application.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pfilip on 10.3.17.
 */
@Entity
@Table(name = "product_has_file")
@AssociationOverrides({
        @AssociationOverride(name = "pf.product",
                joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id")),
        @AssociationOverride(name = "pf.file",
                joinColumns = @JoinColumn(name = "file_id", referencedColumnName = "id")) })
public class ProductFile implements Serializable{

    @EmbeddedId
    private ProductFileId pf  = new ProductFileId();;

    @Column(name = "sequenceNumber")
    private Integer sequenceNumber;

    public ProductFile() {
    }

    public ProductFileId getPf() {
        return pf;
    }

    public void setPf(ProductFileId pf) {
        this.pf = pf;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductFile that = (ProductFile) o;

        return pf != null ? pf.equals(that.pf) : that.pf == null;
    }

//    @Override
//    public int hashCode() {
//        return pf != null ? pf.hashCode() : 0;
//    }
}
