package com.buoi7_0207_Polymorphism.exercise.entity;

public final class Staff extends Employee {

    public Staff(String id, String name, int age, String address, double baseSalary, String position, String departmentId) {
        super(id, name, age, address, baseSalary, "Staff", departmentId);
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary();
    }
}
