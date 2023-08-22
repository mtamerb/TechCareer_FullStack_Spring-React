package com.tamerb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 201: Created
@ResponseStatus(HttpStatus.CREATED)
public class BlogCreatedtException extends RuntimeException{
    public BlogCreatedtException(String message) {
        super(message);
    }
}