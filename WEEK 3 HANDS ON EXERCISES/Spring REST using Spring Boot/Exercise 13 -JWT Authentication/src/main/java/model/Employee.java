package com.cognizant.springlearn.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Employee {

    private int id;

    @NotBlank(message = "Employee name cannot be blank")
    private String name;

    @Min(value = 10000, message = "Salary must be at least 10000")
    private double salary;

    private Department department;

    public Employee() {
    }

    public Employee(int id, String name, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}