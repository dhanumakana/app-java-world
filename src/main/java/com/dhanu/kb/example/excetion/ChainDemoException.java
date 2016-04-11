package com.dhanu.kb.example.excetion;

public class ChainDemoException extends RuntimeException
{
    private static final long serialVersionUID = 6779698698964007087L;

    public ChainDemoException(String message, Exception e)
    {
        super(message, e);
    }

}
