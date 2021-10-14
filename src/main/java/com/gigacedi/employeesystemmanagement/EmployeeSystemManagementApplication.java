package com.gigacedi.employeesystemmanagement;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.gigacedi.employeesystemmanagement.DAO.EmployeeRepository;
import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class EmployeeSystemManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSystemManagementApplication.class, args);


//        @Bean
//        public CommandLineRunner run(EmployeeRepository repository){
//            return (args -> {
//                try {
//                    ObjectMapper mapper = new ObjectMapper();
//                    Employee theEmployee = mapper.readValue(new File("data/sample-full.json"), Employee.class);
//                    System.out.println("First name = " + theEmployee.getFirstName());
//                    System.out.println("Last name = " + theEmployee.getLastName());
//                } finally {
//                    System.out.println("Done");
//                }
//        }
//        }
    }

}
