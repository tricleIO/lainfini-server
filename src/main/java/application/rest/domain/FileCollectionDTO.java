package application.rest.domain;

import application.persistence.entity.ApplicationFile;
import application.persistence.entity.FileCollection;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pfilip on 13.3.17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileCollectionDTO extends ResourceSupport implements ReadWriteDatabaseDTO<FileCollection>, IdentifableDTO<Long>,SlugDTO {

    private Long uid;
    private String title;
    private String description;
    private String slug;
    private Date validFrom;
    private Date validTo;
    private Set<ApplicationFileDTO> files;

    @Override
    public FileCollection toEntity(boolean selectAsParent, Object... parentParams) {
        FileCollection fileCollection = new FileCollection();
        fileCollection.setId(getUid());
        fileCollection.setTitle(getTitle());
        fileCollection.setDescription(getDescription());
        fileCollection.setSlug(getSlug());
        fileCollection.setValidFrom(getValidFrom());
        fileCollection.setValidTo(getValidTo());

        if (files != null) {
            Set<ApplicationFile> convertedFileCollection = new HashSet<>();
            for (ApplicationFileDTO file : files) {
                convertedFileCollection.add(file.toEntity(false));
            }

            fileCollection.setApplicationFiles(convertedFileCollection);
        }
        return fileCollection;
    }

    @Override
    public Long getUid() {
        return this.uid;
    }

    @Override
    public void setUid(Long key) {
        this.uid = key;
    }

    @Override
    public String slugFrom() {
        return title;
    }
}
