package com.buoi7_0207_Polymorphism.exercise.entity;

public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private String address;
    private double baseSalary;
    private String position;
    private String departmentId;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public String getPosition() { return position; }

    public void setPosition(String position) { this.position = position; }

    public String getDepartmentId() { return departmentId; }

    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

    public Employee() { }

    public Employee(String id, String name, int age, String address, double baseSalary, String position, String departmentId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.baseSalary = baseSalary;
        this.position = position;
        this.departmentId = departmentId;
    }

    public abstract double calculateSalary();

    public void showInfo() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Age: " + age +
            ", Address: " + address +
            ", Position: " + position +
            ", Department: " + departmentId +
            ", Salary: " +
            calculateSalary());
    }
}
