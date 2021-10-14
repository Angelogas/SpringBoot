package com.gigacedi.employeesystemmanagement.DemoRestAPI;

import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/test")
public class DemoRestAPIController {

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello World";
//    }
//

    private List<Employee> theEmployees;

    @PostConstruct
    public void loadData() {

        theEmployees = new ArrayList<>();
        theEmployees.add(new Employee("Gastran","Angelo"));
        theEmployees.add(new Employee("Cedrico","Armand"));
        theEmployees.add(new Employee("Imelda","Ngondah"));
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return theEmployees;
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getStudent (@PathVariable int employeeId) {
        return theEmployees.get(employeeId);
    }
}
