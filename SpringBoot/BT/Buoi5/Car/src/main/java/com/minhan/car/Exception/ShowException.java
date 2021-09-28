package com.minhan.car.Exception;

public class ShowException extends RuntimeException{
    public ShowException(String message) {
        super(message);
    }

    public ShowException(String message, Throwable cause) {
        super(message, cause);
    }
}
