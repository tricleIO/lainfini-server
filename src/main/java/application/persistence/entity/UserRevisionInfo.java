package application.persistence.entity;

import application.UserRevisionListener;
import lombok.Data;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
@Data
@RevisionEntity(UserRevisionListener.class)
public class UserRevisionInfo extends DefaultRevisionEntity {

    @Column(columnDefinition = "BINARY(16)")
    private UUID userId;

}
