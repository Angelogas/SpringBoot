package com.gigacedi.employeesystemmanagement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gigacedi.employeesystemmanagement.Entity.Employee;

import java.io.File;

public class TestMain {
    public static void main(String [] args) throws Exception{
        try {
                    ObjectMapper mapper = new ObjectMapper();
                    Employee theEmployee = mapper.readValue(new File("data/sample-full.json"), Employee.class);
                    System.out.println("First name = " + theEmployee.getFirstName());
                    System.out.println("Last name = " + theEmployee.getLastName());
                } finally {
                    System.out.println("Done");
                }
    }
}
