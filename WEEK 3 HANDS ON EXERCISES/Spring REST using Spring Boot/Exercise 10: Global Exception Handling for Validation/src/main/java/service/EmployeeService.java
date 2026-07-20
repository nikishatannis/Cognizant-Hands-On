package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();

        Department it = new Department(10, "IT");
        Department hr = new Department(20, "HR");

        employees.add(new Employee(1, "John", 50000, it));
        employees.add(new Employee(2, "Mary", 60000, hr));

        return employees;
    }
}