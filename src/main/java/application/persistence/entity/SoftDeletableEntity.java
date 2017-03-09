package application.persistence.entity;

/**
 * Created by Johnik on 9.3.2017.
 */
public interface SoftDeletableEntity {
    application.persistence.type.StatusEnum getStatus();

    void setStatus(application.persistence.type.StatusEnum status);
}
