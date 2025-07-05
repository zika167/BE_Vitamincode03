package com.buoi7_0207_Polymorphism.exercise.service;

import com.buoi7_0207_Polymorphism.exercise.entity.Employee;

import java.util.ArrayList;

public class EmployeeManagementImpl implements EmployeeManagement{
    private ArrayList<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    @Override
    public void showEmployees() {
        for (Employee e : employeeList) {
            e.showInfo();
        }
    }

    @Override
    public double calculateTotalSalary() {
        double total = 0;
        for (Employee e : employeeList) {
            total += e.calculateSalary();
        }
        return total;
    }
}
