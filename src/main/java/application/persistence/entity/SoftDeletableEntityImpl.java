package application.persistence.entity;

import application.persistence.type.StatusEnum;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@Audited
@Data
@MappedSuperclass
public abstract class SoftDeletableEntityImpl implements SoftDeletableEntity {

    @Enumerated(EnumType.ORDINAL)
    protected StatusEnum status;

}
