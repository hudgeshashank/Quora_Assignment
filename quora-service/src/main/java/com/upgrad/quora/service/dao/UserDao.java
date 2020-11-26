package com.upgrad.quora.service.dao;

import com.upgrad.quora.service.entity.UserAuthTokenEntity;
import com.upgrad.quora.service.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public UserEntity createUser(UserEntity userEntity)
    {
//        Add the logic to persist the signup user data
        return null;
    }
    public UserEntity getUserByUserName(final String username)
    {
//        Write the logic to fetch user by username
            return null;
    }
    public UserEntity getUserByEmail(final String email)
    {
//        Write the logic to fetch user by email
        return null;

    }

    public UserAuthTokenEntity getAuthToken(final String authorization)
    {
//        write logic to fetch access token
     return null;
    }

    public UserAuthTokenEntity saveLogin(final UserAuthTokenEntity userAuthTokenEntity)
    {
//        perssit the login data
        return null;
    }

    public UserAuthTokenEntity signout(final UserAuthTokenEntity userAuthTokenEntity)
    {
//        Write the logic to update sign out data
        return null;
    }

}
