package com.dhanu.kb.example.service.impl;

import org.springframework.stereotype.Service;

import com.dhanu.kb.example.model.Employee;
import com.dhanu.kb.example.service.DemoService;

@Service("serviceTwo")
public class DemoServerImpl2 implements DemoService
{

    @Override
    public Employee getOne()
    {
        
        return null;
    }

}
