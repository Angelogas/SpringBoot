package com.gigacedi.employeesystemmanagement.DemoRestAPI;

import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/test")
public class DemoRestAPIController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> theEmployees = new ArrayList<>();
        theEmployees.add(new Employee("Gastran","Angelo"));
        theEmployees.add(new Employee("Cedrico","Armand"));
        return theEmployees;
    }
}
