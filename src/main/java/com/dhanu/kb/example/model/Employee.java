package com.dhanu.kb.example.model;

import java.util.List;

public class Employee
{
    String name;
    List<String> fruits;

    public Employee()
    {

    }

    public Employee(String name, List<String> fruits)
    {
        super();
        this.name = name;
        this.fruits = fruits;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<String> getFruits()
    {
        return fruits;
    }

    public void setFruits(List<String> fruits)
    {
        this.fruits = fruits;
    }

    @Override
    public String toString()
    {
        return "Employee [name=" + name + ", fruits=" + fruits + "]";
    }
}
