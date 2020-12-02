package com.upgrad.quora.api.controller;

import com.upgrad.quora.api.model.*;
import com.upgrad.quora.service.business.QuestionBusiessService;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.InvalidQuestionException;
import com.upgrad.quora.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return null;

    }

    @RequestMapping(method = RequestMethod.GET, path = "/question/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<QuestionDetailsResponse>> getAllQuestions(@RequestHeader("authorization")final String authorization) throws AuthorizationFailedException {
//     Add the controller logic to get all the questions irrespective of the  user
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/question/edit/{questionId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<QuestionEditResponse> editQuestion(@RequestHeader("authorization")final String authorization,
                                                             @PathVariable("questionId")final String uuid,
                                                             final QuestionEditRequest questionEditRequest) throws AuthorizationFailedException, InvalidQuestionException {
        //     Add the controller logic to edit the question
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/question/delete/{questionId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<QuestionDeleteResponse> deleteQuestion(@RequestHeader("authorization")final String authorization,
                                                                 @PathVariable("questionId")final String uuid) throws AuthorizationFailedException, InvalidQuestionException {
        //     Add the controller logic to delete the question
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/question/all/{userId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<QuestionDetailsResponse>> getQuestionsByUser(@RequestHeader("authorization")final String authorization,
                                                                            @PathVariable("userId")final String uuid) throws AuthorizationFailedException, UserNotFoundException {
//     Add the controller logic to get all the questions of user
        return null;
    }


}
