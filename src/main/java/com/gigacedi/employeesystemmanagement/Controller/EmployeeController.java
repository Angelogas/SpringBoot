package com.gigacedi.employeesystemmanagement.Controller;

import com.gigacedi.employeesystemmanagement.DAO.EmployeeDAO;
import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping ("/list")
    public String homePage(Model model) {
        List<Employee> employeesList = employeeDAO.getEmployees();
        model.addAttribute("employees",employeesList);
        return "employee-list";
    }
}
