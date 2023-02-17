package com.gestionsalledecours.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super("element could not found");
    }
}
