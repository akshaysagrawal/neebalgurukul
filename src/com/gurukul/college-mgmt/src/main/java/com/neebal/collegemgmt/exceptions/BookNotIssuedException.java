package com.neebal.collegemgmt.exceptions;

public class BookNotIssuedException extends RuntimeException{
    public BookNotIssuedException(String message) {
        super(message);
    }
}
