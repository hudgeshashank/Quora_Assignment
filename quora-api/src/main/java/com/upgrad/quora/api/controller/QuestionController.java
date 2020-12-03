package com.upgrad.quora.api.controller;

import com.upgrad.quora.api.model.*;
import com.upgrad.quora.service.business.QuestionBusiessService;
import com.upgrad.quora.service.entity.QuestionEntity;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.InvalidQuestionException;
import com.upgrad.quora.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class QuestionController {

    @Autowired
    private QuestionBusiessService questionBusiessService;

    @RequestMapping(method = RequestMethod.POST, path = "/question/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<QuestionResponse> createQuestion(@RequestHeader("authorization")final String authorization,
                                                           QuestionRequest questionRequest) throws AuthorizationFailedException {
//     Add the controller logic to create user
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setContent(questionRequest.getContent());
        questionEntity = questionBusiessService.createQuestion(authorization, questionEntity);
        QuestionResponse questionResponse = new QuestionResponse();
        questionResponse.setId(questionEntity.getUuid());
        questionResponse.setStatus("QUESTION CREATED");
        return new ResponseEntity<QuestionResponse>(questionResponse, HttpStatus.CREATED);

    }

    @RequestMapping(method = RequestMethod.GET, path = "/question/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<QuestionDetailsResponse>> getAllQuestions(@RequestHeader("authorization")final String authorization) throws AuthorizationFailedException {
//     Add the controller logic to get all the questions irrespective of the  user
        List<QuestionEntity> questions = questionBusiessService.getAllQuestions(authorization);
        List<QuestionDetailsResponse> questionDetailResponses = new ArrayList<>();
        for (QuestionEntity questionEntity : questions) {
            QuestionDetailsResponse questionDetailResponse = new QuestionDetailsResponse();
            questionDetailResponse.setId(questionEntity.getUuid());
            questionDetailResponse.setContent(questionEntity.getContent());
            questionDetailResponses.add(questionDetailResponse);
        }
        return new ResponseEntity<List<QuestionDetailsResponse>>(
                questionDetailResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/question/edit/{questionId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<QuestionEditResponse> editQuestion(@RequestHeader("authorization")final String authorization,
                                                             @PathVariable("questionId")final String uuid,
                                                             final QuestionEditRequest questionEditRequest) throws AuthorizationFailedException, InvalidQuestionException {
        //     Add the controller logic to edit the question
        QuestionEntity questionEntity =
                questionBusiessService.editQuestion(authorization, uuid, questionEditRequest.getContent());
        QuestionEditResponse questionEditResponse = new QuestionEditResponse();
        questionEditResponse.setId(questionEntity.getUuid());
        questionEditResponse.setStatus("QUESTION EDITED");
        return new ResponseEntity<QuestionEditResponse>(questionEditResponse, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/question/delete/{questionId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<QuestionDeleteResponse> deleteQuestion(@RequestHeader("authorization")final String authorization,
                                                                 @PathVariable("questionId")final String uuid) throws AuthorizationFailedException, InvalidQuestionException {
        //     Add the controller logic to delete the question
        QuestionEntity questionEntity = questionBusiessService.deleteQuestion(authorization, uuid);
        QuestionDeleteResponse questionDeleteResponse = new QuestionDeleteResponse();
        questionDeleteResponse.setId(questionEntity.getUuid());
        questionDeleteResponse.setStatus("QUESTION DELETED");
        return new ResponseEntity<QuestionDeleteResponse>(questionDeleteResponse, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/question/all/{userId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<QuestionDetailsResponse>> getQuestionsByUser(@RequestHeader("authorization")final String authorization,
                                                                            @PathVariable("userId")final String uuid) throws AuthorizationFailedException, UserNotFoundException {
//     Add the controller logic to get all the questions of user
        List<QuestionEntity> questions = questionBusiessService.getAllQuestionsByUser(authorization, uuid);
        List<QuestionDetailsResponse> questionDetailResponses = new ArrayList<>();
        for (QuestionEntity questionEntity : questions) {
            QuestionDetailsResponse questionDetailResponse = new QuestionDetailsResponse();
            questionDetailResponse.setId(questionEntity.getUuid());
            questionDetailResponse.setContent(questionEntity.getContent());
            questionDetailResponses.add(questionDetailResponse);
        }
        return new ResponseEntity<List<QuestionDetailsResponse>>(
                questionDetailResponses, HttpStatus.OK);
    }


}
