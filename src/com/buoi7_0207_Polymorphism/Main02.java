package com.buoi7_0207_Polymorphism;

import com.buoi7_0207_Polymorphism.lesson.service.StudentService;

public class Main02 {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.inputListStudent();
        studentService.outputDataStudent();
    }
}
