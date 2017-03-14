package application.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pfilip on 13.3.17.
 */
@Entity
@Table(name = "file_collection_has_file")
@AssociationOverrides({
        @AssociationOverride(name = "fc.collection",
                joinColumns = @JoinColumn(name = "collection_id", referencedColumnName = "id")),
        @AssociationOverride(name = "fc.file",
                joinColumns = @JoinColumn(name = "file_id", referencedColumnName = "id")) })
public class FileCollectionHasFile implements Serializable {

    @EmbeddedId
    private FileCollectionHasFileId fc  = new FileCollectionHasFileId();;

    @Column(name = "sequenceNumber")
    private Integer sequenceNumber;

    public FileCollectionHasFile() {
    }

    public FileCollectionHasFileId getFc() {
        return fc;
    }

    public void setFc(FileCollectionHasFileId fc) {
        this.fc = fc;
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

        FileCollectionHasFile that = (FileCollectionHasFile) o;

        if (fc != null ? !fc.equals(that.fc) : that.fc != null) return false;
        return sequenceNumber != null ? sequenceNumber.equals(that.sequenceNumber) : that.sequenceNumber == null;
    }

    @Override
    public int hashCode() {
        int result = getFc().getCollection().getId().hashCode();
        result = 31 * result + getFc().getFile().getId().hashCode();
        return result;
    }
}
