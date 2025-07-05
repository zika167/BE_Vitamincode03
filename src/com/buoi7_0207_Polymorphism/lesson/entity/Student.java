package com.buoi7_0207_Polymorphism.lesson.entity;

public class Student {
    private String id;
    private String fullName;
    private String gender;
    private String major;
    // OOP = Properties + Methods
    // Constructor():
    //  + Hàm tạo là hàm để khởi tạo ra 1 đối tượng
    //  + Tên hàm giống tên class
    // Encapsulation

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(){}
    public Student(String id, String fullName, String gender, String major) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.major = major;
    }
    public void outputData(){
        System.out.println("---------------------------------------------- ");
        System.out.println("Id = "+ this.id);
        System.out.println("Tên Sinh Viên = "+ this.fullName);
        System.out.println("Giới Tính = "+ this.gender);
        System.out.println("Chuyên Ngành = "+ this.major);
        System.out.println("---------------------------------------------- ");
    }
}
