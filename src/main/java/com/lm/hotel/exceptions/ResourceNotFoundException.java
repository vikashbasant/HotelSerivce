package com.lm.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource Not Found!");
    }
    public ResourceNotFoundException (String s) {
        super(s);
    }
}
