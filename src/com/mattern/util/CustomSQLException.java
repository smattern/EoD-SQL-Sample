package com.mattern.util;

/**
 * @author smattern.
 */
public class CustomSQLException extends Exception {

    public CustomSQLException() {
    }

    //Constructor that accepts a message
    public CustomSQLException(String message) {
        super(message);
    }
}
