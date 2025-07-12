package com.buoi7_0207_Polymorphism.exercise.entity;

public final class Staff extends Employee {
    private final double bonus = 0;

    public Staff(int id, String name, int departmentId) {
        super(id, name,  departmentId);
    }

    public Staff() {

    }
}
