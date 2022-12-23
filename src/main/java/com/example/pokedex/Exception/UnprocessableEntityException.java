package com.example.pokedex.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocessableEntityException extends RuntimeException {

    public UnprocessableEntityException(){
        super("Request body could not be processed. ");
    }

    public UnprocessableEntityException(String message){
        super(message);
    }
}

