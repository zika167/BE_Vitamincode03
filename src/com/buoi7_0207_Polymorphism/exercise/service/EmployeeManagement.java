package com.buoi7_0207_Polymorphism.exercise.service;

import com.buoi7_0207_Polymorphism.exercise.entity.Employee;

public interface EmployeeManagement {
    void addEmployee(Employee e);
    void showEmployees();
    double calculateTotalSalary();
}
