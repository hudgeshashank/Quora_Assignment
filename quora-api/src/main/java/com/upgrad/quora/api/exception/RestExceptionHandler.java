package com.upgrad.quora.api.exception;

import com.upgrad.quora.api.model.ErrorResponse;
import com.upgrad.quora.service.exception.AuthenticationFailedException;
import com.upgrad.quora.service.exception.SignOutRestrictedException;
import com.upgrad.quora.service.exception.SignUpRestrictedException;
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
        return null;
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> authenticationfailed(AuthenticationFailedException exc,WebRequest request)
    {
        //        Handle the exception
        return null;
    }

    @ExceptionHandler
    public  ResponseEntity<ErrorResponse> signoutfailed(SignOutRestrictedException exc, WebRequest request)
    {
        //        Handle the exception
        return null;
   }

}
