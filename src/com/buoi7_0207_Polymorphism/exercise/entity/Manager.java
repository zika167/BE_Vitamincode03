package com.buoi7_0207_Polymorphism.exercise.entity;

public class Manager extends Employee{
    private double allowance = 5000000;

    public Manager(int id, String name,  int departmentId) {
        super(id, name, departmentId);
    }

    public Manager() {
    }

}
