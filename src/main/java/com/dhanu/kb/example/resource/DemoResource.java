package com.dhanu.kb.example.resource;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhanu.kb.example.service.DemoService;

@RestController
public class DemoResource
{
    @Autowired
    DemoService demoServiceImpl;

    @GET
    @RequestMapping("/test")
    public void resource1()
    {
        System.out.println("Hi : " + demoServiceImpl.getOne());
    }
}
