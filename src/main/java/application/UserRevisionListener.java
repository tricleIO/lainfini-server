package application;

import application.persistence.entity.User;
import application.persistence.entity.UserRevisionInfo;
import application.service.security.CustomUserDetails;
import org.hibernate.envers.RevisionListener;

public class UserRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        User currentUser = CustomUserDetails.getCurrentUser();
        if (currentUser != null) {
            UserRevisionInfo userRevEntity = (UserRevisionInfo) revisionEntity;
            userRevEntity.setUserId(currentUser.getId());
        }
    }

}
