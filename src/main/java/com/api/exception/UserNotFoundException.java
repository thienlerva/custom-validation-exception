package com.api.exception;

public class UserNotFoundException  extends Exception{

    private static final long serialVersionUID = -354534524L;

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, final Throwable cause) {
        super(message, cause);
    }
}
