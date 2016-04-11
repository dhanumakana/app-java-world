package com.dhanu.kb.example.chain.base;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dhanu.kb.example.chain.ArrangeFinancing;
import com.dhanu.kb.example.chain.CloseSale;
import com.dhanu.kb.example.chain.GetCustomerInfo;
import com.dhanu.kb.example.chain.NegotiateSale;
import com.dhanu.kb.example.chain.TestDriveVehicle;
import com.dhanu.kb.example.excetion.ChainDemoException;

public class SellVehicleChain extends ChainBase
{
    private static final Logger logger = LoggerFactory.getLogger(SellVehicleChain.class);
    
    public SellVehicleChain()
    {
        super();
        addCommand(new GetCustomerInfo());
        addCommand(new TestDriveVehicle());
        addCommand(new CloseSale());
        addCommand(new NegotiateSale());
        addCommand(new ArrangeFinancing());
        
    }

   /* public static void main(String[] args) throws Exception
    {
        try{
        Command process = new SellVehicleChain();
        Context ctx = new ContextBase();
        process.execute(ctx);
        }catch(ChainDemoException e){
            logger.error(e.getMessage());
        }
    }*/
}