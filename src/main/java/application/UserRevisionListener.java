package application;

import application.persistence.entity.User;
import application.persistence.entity.UserRevisionInfo;
import application.service.security.CustomUserDetails;
import org.hibernate.envers.RevisionListener;

public class UserRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        UserRevisionInfo userRevEntity = (UserRevisionInfo) revisionEntity;
        User currentUser = CustomUserDetails.getCurrentUser();
        userRevEntity.setUserId(currentUser.getId());
    }

}
