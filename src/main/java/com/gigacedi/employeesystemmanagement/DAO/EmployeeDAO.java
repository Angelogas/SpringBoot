package com.gigacedi.employeesystemmanagement.DAO;

import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDAO {
    public List<Employee> getEmployees();
}
