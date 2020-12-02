package com.upgrad.quora.api.controller;

import com.upgrad.quora.api.model.*;
import com.upgrad.quora.service.business.AnswerBusinessService;
import com.upgrad.quora.service.exception.AnswerNotFoundException;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.InvalidQuestionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnswerController {

    @Autowired
    private AnswerBusinessService answerBusinessService;

    @RequestMapping(method = RequestMethod.POST, path = "question/{questionId}/answer/create", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AnswerResponse> createAnswer(@RequestHeader("authorization")final String authorization,
                                                       @PathVariable("questionId")final String questionid,
                                                       final AnswerRequest answerRequest) throws AuthorizationFailedException, InvalidQuestionException {
//        Add the controller logic to create the answer
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "answer/edit/{answerId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AnswerEditResponse> editAnswer(@RequestHeader("authorization")final String authorization,
                                                         @PathVariable("answerId")final String answerid,
                                                         final AnswerEditRequest answerEditRequest) throws AuthorizationFailedException, AnswerNotFoundException {
//        Add the controller logic to edit the answer
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "answer/delete/{answerId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public ResponseEntity<AnswerDeleteResponse> deleteAnswer(@RequestHeader("authorization")final String authorization,
                                                             @PathVariable("answerId")final String answerid) throws AuthorizationFailedException, AnswerNotFoundException {
//        Add the controller logic to delete the answer
        return null;
    }


    @RequestMapping(method = RequestMethod.GET, path = "answer/all/{questionId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public ResponseEntity<List<AnswerDetailsResponse>> getAllAnswer(@RequestHeader("authorization")final String authorization,
                                                                    @PathVariable("questionId")final String questionid) throws AuthorizationFailedException, InvalidQuestionException {
//        Add the controller logic to get all the answer for a question
        return null;
    }

}
