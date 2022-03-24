package com.bloomshoppingcomplex.Exceptions;

public class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException() {
        super();
    }

    public ItemNotFoundException(String message) {
        super(message);
    }

    public ItemNotFoundException(Throwable cause) {
        super(cause);
    }

    public ItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
