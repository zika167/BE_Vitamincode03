package com.buoi7_0207_Polymorphism.exercise.entity;

public abstract class Employee {
    private int id;
    private String name;
    private int departmentId;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getDepartmentId() { return departmentId; }

    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public Employee() { }

    public Employee(int id, String name, int departmentId) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
    }

    public void showInfo() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Department: " + departmentId);
    }
}
