package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.QuestionDao;
import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.QuestionEntity;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.InvalidQuestionException;
import com.upgrad.quora.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionBusiessService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private QuestionDao questionDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public QuestionEntity createUser(final String authorization, QuestionEntity questionEntity) throws AuthorizationFailedException {
        //    Add the businnes logic to create the question

        return null;
    }


    public List<QuestionEntity> getAllQuestion(final String authorization) throws AuthorizationFailedException {
//    Add the businnes logic to get all question irrespective of user
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public QuestionEntity editQuestion(final String authorization, final String uuid, final String content) throws AuthorizationFailedException, InvalidQuestionException {
        //    Add the businnes logic to edit the question
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public QuestionEntity deleteQuestion(final String authorization, final String uuid) throws AuthorizationFailedException, InvalidQuestionException {//       Add the business logic to get all the question of particular user
//    Add the businnes logic to delete the question
        return null;

    }

    public List<QuestionEntity> getAllQuestionBuUser(final String authorization, final String uuid) throws AuthorizationFailedException, UserNotFoundException {
//       Add the business logic to get all the question of particular user
        return null;

    }
}
