package com.dhanu.kb.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KingBrinjalApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(KingBrinjalApplication.class, args);
    }
}

