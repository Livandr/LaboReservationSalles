package com.gestionsalledecours.exception;

import lombok.Getter;

@Getter
public class EmailAlreadyTakenException extends RuntimeException{

    public EmailAlreadyTakenException(){
        super("the specified e-mail is already taken");
    }
}
