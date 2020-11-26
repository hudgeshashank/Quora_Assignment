package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.UserAuthTokenEntity;
import com.upgrad.quora.service.exception.AuthenticationFailedException;
import com.upgrad.quora.service.exception.SignOutRestrictedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthenticationService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordCryptographyProvider passwordCryptographyProvider;

    @Transactional(propagation = Propagation.REQUIRED)
    public UserAuthTokenEntity authenticate(final String username,final String password) throws AuthenticationFailedException {
//        Write the logic to sign in and also throw the exception when required
       return null;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public UserAuthTokenEntity signout(final String authorization) throws SignOutRestrictedException {
//        Write the logic to sign out and also throw the exception when required
        return null;
    }
}
