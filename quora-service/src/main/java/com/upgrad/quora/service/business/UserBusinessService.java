package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.UserEntity;
import com.upgrad.quora.service.exception.SignUpRestrictedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserBusinessService {


    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordCryptographyProvider passwordCryptographyProvider;


    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity signup(UserEntity userEntity) throws SignUpRestrictedException {
//        Write the logic to sign up the user
//        If the username already exist throw exception given in problem statement
//        if the email already exists throw exception given in prolem statement
        return null;
    }
}
