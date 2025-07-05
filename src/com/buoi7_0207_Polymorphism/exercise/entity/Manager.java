package com.buoi7_0207_Polymorphism.exercise.entity;

public class Manager extends Employee{
    private double allowance = 5000000;

    public Manager(String id, String name, int age, String address, double baseSalary, String departmentId) {
        super(id, name, age, address, baseSalary, "Manager", departmentId);
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() + allowance;
    }
}
