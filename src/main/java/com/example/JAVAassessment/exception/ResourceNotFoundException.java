package com.example.JAVAassessment.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id ){
        super("Could not find task:" + id);
    }
}
