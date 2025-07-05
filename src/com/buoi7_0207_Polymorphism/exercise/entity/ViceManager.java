package com.buoi7_0207_Polymorphism.exercise.entity;

public final class ViceManager extends Employee {
    private double allowance = 3000000;

    public ViceManager(String id, String name, int age, String address, double baseSalary, String departmentId) {
        super(id, name, age, address, baseSalary, "Vice Manager", departmentId);
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary()  + allowance;
    }
}
