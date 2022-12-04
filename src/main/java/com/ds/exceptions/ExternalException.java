package com.ds.exceptions;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public class ExternalException {
    private String message;
    private HttpStatus httpStatus;
}
