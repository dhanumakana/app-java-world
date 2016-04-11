package com.dhanu.kb.example.chain;

import java.io.IOException;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dhanu.kb.example.excetion.ChainDemoException;

public class CloseSale implements Command
{
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public boolean execute(Context ctx) throws Exception
    {
        System.out.println(
                "Congratulations " + ctx.get("customerName") + ", you bought a new car!");
        try
        {
            int x = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            final String msg = "Hi";
            logger.error(msg+" Error {}", e);
            throw new ChainDemoException(msg, new IOException());
        }
        return false;
    }
}