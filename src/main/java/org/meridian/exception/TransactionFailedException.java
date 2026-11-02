package org.meridian.exception;

public class TransactionFailedException extends RuntimeException{
    public TransactionFailedException(){
        super("Transaction failed");
    }

    public TransactionFailedException(String message){
        super(message);
    }

    public TransactionFailedException(String message,Throwable cause){
        super(message,cause);
    }
}
