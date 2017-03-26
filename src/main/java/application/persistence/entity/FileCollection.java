package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.rest.domain.ApplicationFileDTO;
import application.rest.domain.FileCollectionDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pfilip on 13.3.17.
 */
@Entity
@Table(name = "file_collection")
@Data
@EqualsAndHashCode(exclude="files")
public class FileCollection implements DTOConvertable<FileCollectionDTO>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name="url_slug")
    private String urlSlug;

    @Column(name = "valid_from", nullable = false)
    private Date validFrom;

    @Column(name = "valid_to")
    private Date validTo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fc.collection", cascade= CascadeType.PERSIST)
    private Set<FileCollectionHasFile> files = new HashSet<>();

    @Transient
    private Set<ApplicationFile> applicationFiles;

    @Override
    public FileCollectionDTO toDTO(boolean selectAsParent, Object... parentParams) {
        FileCollectionDTO fileCollectionDTO = new FileCollectionDTO();
        fileCollectionDTO.setUid(getId());
        fileCollectionDTO.setTitle(getTitle());
        fileCollectionDTO.setDescription(getDescription());
        fileCollectionDTO.setUrlSlug(getUrlSlug());
        fileCollectionDTO.setValidFrom(getValidFrom());
        fileCollectionDTO.setValidTo(getValidTo());

        if(selectAsParent) {
            Set<ApplicationFileDTO> applicationFileDTOS = new HashSet<>(files.size());
            for (FileCollectionHasFile file : files) {
                ApplicationFileDTO applicationFileDTO = file.getFc().getFile().toDTO(false);
                applicationFileDTO.setSequenceNumber(file.getSequenceNumber());
                applicationFileDTOS.add(applicationFileDTO);
            }
            fileCollectionDTO.setFiles(applicationFileDTOS);
        }

        return fileCollectionDTO;
    }
}
