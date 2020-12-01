package com.upgrad.quora.service.dao;

import com.upgrad.quora.service.entity.QuestionEntity;
import com.upgrad.quora.service.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class QuestionDao {

    @PersistenceContext
    private EntityManager entityManager;

   public QuestionEntity createQuestion(QuestionEntity questionEntity)
   {
       //       Add the logic to persist the question data
       return null;
   }

   public List<QuestionEntity> getAllQuestion()
   {
//       Add the logic to get all the question irrespective of user
       return null;

   }

   public QuestionEntity editQuestion(final QuestionEntity questionEntity)
   {
       //       Add the logic to update the question content
       return null;
   }

    public QuestionEntity getQuestionByUuid(final String uuid) {
//       Add the logic to get  question by uuid
        return null;

    public QuestionEntity deleteQuestion(final QuestionEntity questionEntity){
       entityManager.remove(questionEntity);
       return questionEntity;
    }
    public List<QuestionEntity> getAllQuestionByUser(final UserEntity userEntity)
    {
//       Add the logic to get all the question which are specifc to user
        return null;
    }
}
