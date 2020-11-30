package com.upgrad.quora.api.exception;

import com.upgrad.quora.api.model.ErrorResponse;
import com.upgrad.quora.service.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(SignUpRestrictedException.class)
    public ResponseEntity<ErrorResponse> signuprestricted(SignUpRestrictedException exc, WebRequest request)
    {
//        Handle the exception
        return new ResponseEntity<ErrorResponse>(new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(AuthenticationFailedException.class)
    public ResponseEntity<ErrorResponse> authenticationfailed(AuthenticationFailedException exc,WebRequest request)
    {
        //        Handle the exception
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()),
                HttpStatus.UNAUTHORIZED);

    }

    @ExceptionHandler
    public  ResponseEntity<ErrorResponse> signoutfailed(SignOutRestrictedException exc, WebRequest request)
    {
        //        Handle the exception
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exc.getCode()).message(exc.getErrorMessage()), HttpStatus.UNAUTHORIZED
        );

    }

    @ExceptionHandler(AuthorizationFailedException.class)
    public ResponseEntity<ErrorResponse> authorizationfailed(AuthorizationFailedException exc, WebRequest request)
    {
//      Handle the exception for authorizationfailedexception
        return null;
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> userNotFound(UserNotFoundException exc, WebRequest request)
    {
//      Handle the exception for usernotfoundexception
        return null;
    }

}
