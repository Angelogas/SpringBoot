package com.gigacedi.employeesystemmanagement.DAO;

import com.gigacedi.employeesystemmanagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
