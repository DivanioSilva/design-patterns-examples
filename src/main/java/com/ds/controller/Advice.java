package com.ds.controller;

import com.ds.exceptions.BaseException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Advice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {BaseException.class})
    protected Object dbExceptionsHandler(BaseException baseException, WebRequest webRequest){
        System.out.println("Estou no controller advice");

        return handleExceptionInternal(baseException, baseException.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, webRequest);
    }

}
