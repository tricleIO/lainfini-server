package application;

import application.persistence.entity.User;
import application.persistence.entity.UserRevEntity;
import application.service.security.CustomUserDetails;
import org.hibernate.envers.RevisionListener;

public class UserRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        UserRevEntity userRevEntity = (UserRevEntity) revisionEntity;
        User currentUser = CustomUserDetails.getCurrentUser();
        userRevEntity.setUserId(currentUser.getId());
        userRevEntity.setUsername(currentUser.getEmail());
    }

}
