package application.persistence.entity;

import application.persistence.type.StatusEnum;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class SoftDeletableEntity {

    @Enumerated(EnumType.ORDINAL)
    protected StatusEnum status;

}
