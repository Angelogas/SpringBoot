package com.gigacedi.employeesystemmanagement.DemoRestAPI;

import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        if (employeeId >= theEmployees.size() || employeeId < 0) {
            throw  new EmployeeNotFoundException("Student not found - "+ employeeId);
        }
        return theEmployees.get(employeeId);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exc) {

        EmployeeErrorResponse error = new EmployeeErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return  new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(Exception exc) {

        EmployeeErrorResponse error = new EmployeeErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return  new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
