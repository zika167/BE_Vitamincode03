package com.buoi7_0207_Polymorphism.exercise.entity;

import java.util.ArrayList;

public class Department {
    private String departmentId;
    private String departmentName;
    private String departmentAddress;
    private ArrayList<Employee> employees;

    public Department(String departmentId, String departmentName, String departmentAddress, ArrayList<Employee> employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.employees = employees;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showAllEmployee() {
        for (Employee e : employees) {
            e.showInfo();
        }
    }

    public double getTotalSalary() {
        double sum = 0;
        for ( Employee e : employees ) {
            sum += e.calculateSalary();
        }
        return sum;
    }
}


