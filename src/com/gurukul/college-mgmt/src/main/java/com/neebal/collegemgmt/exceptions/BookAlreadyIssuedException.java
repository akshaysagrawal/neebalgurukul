package com.neebal.collegemgmt.exceptions;

public class BookAlreadyIssuedException extends RuntimeException{

    public BookAlreadyIssuedException(String message) {
        super(message);
    }
}
