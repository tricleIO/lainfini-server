package application.persistence.entity;

import application.persistence.DTOConvertable;
import application.persistence.type.FileStatusEnum;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 * Created by pfilip on 2.3.17.
 */
@Data
@Table(indexes = { @Index(name = "IDX_FILEINDEX", columnList = "index") })
@MappedSuperclass
public abstract class AbstractFile<T>  implements DTOConvertable<T>, Serializable {

    /**
     * Path to file is defined as /ddd/ddd/dd{id}/fileName
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_index", columnDefinition = "BINARY(16)")
    private UUID index;

    @Column(name = "file_name", length = 255)
    private String fileName;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "file_description", length = 511)
    private String fileDescription;

    @Column(name = "file_status")
    @Enumerated(EnumType.STRING)
    private FileStatusEnum fileStatus;

    @Column(name = "valid_from", nullable = false)
    private Date validFrom = new Date();

    @Column (name = "valid_to")
    private Date validTo;

    @ManyToMany(cascade=CascadeType.ALL, mappedBy="documentFiles")
    private Set<Product> products;


}
