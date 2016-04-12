package com.dhanu.kb.example.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.dhanu.kb.example.model.Employee;
import com.dhanu.kb.example.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService
{
    final static int REQUEST_ATTEMPTS = 5;

    @Override
    public Employee getOne()
    {
        return getOneEmployee();
    }

    private Employee getOneEmployee()
    {
        Exception savedException = null;
        Employee response = null;
        int attempt = 0;

        while (response == null && attempt < REQUEST_ATTEMPTS)
        {
            try
            {
                response = getSampleEmp(attempt);
                savedException = null;
            }
            catch (Exception e)
            {
                savedException = e;
            }

            if (null == response && attempt++ < REQUEST_ATTEMPTS)
            {
                System.out.println("Delaying..!!"+ savedException);
            }
        }
        return response;
    }

    private Employee getSampleEmp(int count)
    {
        if (count >= REQUEST_ATTEMPTS-1)
        {
            return new Employee("dhanu", Arrays.asList("Apple", "Orange", "Banana"));
        }
        return null;
    }

}
