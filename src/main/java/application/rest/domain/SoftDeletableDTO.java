package application.rest.domain;

import application.persistence.type.StatusEnum;

public interface SoftDeletableDTO {

    StatusEnum getStatus();
    void setStatus(StatusEnum status);

}
