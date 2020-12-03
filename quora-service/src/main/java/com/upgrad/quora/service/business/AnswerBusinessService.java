package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.AnswerDao;
import com.upgrad.quora.service.dao.QuestionDao;
import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.AnswerEntity;
import com.upgrad.quora.service.exception.AnswerNotFoundException;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.InvalidQuestionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnswerBusinessService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private QuestionDao questionDao;

    @Autowired
    private AnswerDao answerDao;


    @Transactional(propagation = Propagation.REQUIRED)
    public AnswerEntity createAnswer(final String authorization, String  questionId, AnswerEntity answerEntity) throws AuthorizationFailedException, InvalidQuestionException {
//      Add the business logic to create the answer
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public AnswerEntity editAnswer(final String authorization, final String answerid, final String editedAnswer) throws AuthorizationFailedException, AnswerNotFoundException {
        //      Add the business logic to edit the answer
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public AnswerEntity deleteAnswer(final String authorization, final String answerid) throws AuthorizationFailedException, AnswerNotFoundException {
        //      Add the business logic to delete the answer
        return null;
    }

    public List<AnswerEntity> getAllAswer(final String authorization, final String questionId) throws AuthorizationFailedException, InvalidQuestionException {
        //      Add the business logic to get all answer
        return null;
    }


}
