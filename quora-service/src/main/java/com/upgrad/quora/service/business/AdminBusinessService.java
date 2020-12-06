package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.UserAuthTokenEntity;
import com.upgrad.quora.service.entity.UserEntity;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminBusinessService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserAdminBusinessService userAdminBusinessService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUser(final String authorization, final String uuid) throws AuthorizationFailedException, UserNotFoundException {
//   Add the business logic to delete the user

        UserAuthTokenEntity userAuthTokenEntity = userAdminBusinessService.authorize(authorization);

        UserEntity userEntity = userDao.getUserByUuid(uuid);
        if(userEntity == null) {
            throw new UserNotFoundException("USR-001","User with entered uuid to be deleted does not exist");
        }

        String role = userEntity.getRole();
        if(role.equals("nonadmin")) {
            throw new AuthorizationFailedException("ATHR-003", "Unauthorized Access, Entered user is not an admin");
        }
        userDao.deleteAuthToken(userAuthTokenEntity);
        userDao.deleteUser(userEntity);
    }
}
