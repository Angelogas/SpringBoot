package com.gigacedi.employeesystemmanagement.DAO;

import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {

        return employeeRepository.findAll();
    }
}
