package com.ds.controller;
import com.ds.exceptions.BaseException;
import com.ds.exceptions.ExternalException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class Advice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {BaseException.class})
    protected Object dbExceptionsHandler(BaseException baseException, WebRequest webRequest) {
        System.out.println("Estou no controller advice");

        return handleExceptionInternal(baseException, baseException.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, webRequest);
    }

    @ExceptionHandler(value = {NoSuchElementException.class})
    protected ExternalException noSurchElementException(NoSuchElementException baseException, WebRequest webRequest) {
        System.out.println("Estou no controller advice");

        //return handleExceptionInternal(baseException, baseException.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, webRequest);
        ExternalException externalException = ExternalException
                .builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(baseException.getMessage()).build();
        return externalException;
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    protected Object argValidationExceptionHandler(MethodArgumentNotValidException baseException, WebRequest webRequest) {
        System.out.println("Estou no controller advice");
        List<ExternalException> exceptions = new ArrayList<>();
        //baseException.get

        return handleExceptionInternal(baseException, baseException.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, webRequest);
    }

}


