package com.buoi7_0207_Polymorphism.lesson.service;

import com.buoi7_0207_Polymorphism.lesson.entity.Student;
import com.buoi7_0207_Polymorphism.lesson.entity.StudentDesign;
import com.buoi7_0207_Polymorphism.lesson.entity.StudentIT;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    Scanner sc = new Scanner(System.in);

    ArrayList<Student> listStudent = new ArrayList<>();
    public void inputListStudent(){
        do {
            System.out.print("Chuyên Ngành IT/Desgin >> ");
            String major = sc.nextLine();
            Student sv;
            if(major.equalsIgnoreCase("IT")){
                sv = inputDataStudentIT();
            } else{
                sv = inputDataStudentDesign();
            }
            listStudent.add(sv);
            System.out.print("Nhập tiếp hông (y/n) >> ");
            String answer = sc.nextLine();
            if (!answer.equals("y")) {
                break;
            }
        } while (true);
    }

    StudentIT inputDataStudentIT() {
        System.out.println("------ ");
        StudentIT sv = new StudentIT();
        System.out.print("Mã Sinh Viên = ");
        String id = sc.nextLine();
        sv.setId(id);
        System.out.print("Tên Sinh Viên = ");
        String fullName = sc.nextLine();
        sv.setFullName(fullName);
        System.out.print("Giới Tính = ");
        String gender = sc.nextLine();
        sv.setGender(gender);
        System.out.print("Chuyên Ngành = ");
        String major = sc.nextLine();
        sv.setMajor(major);
        System.out.print("Kỹ Thuật = ");
        String technical = sc.nextLine();
        sv.setTechnical(technical);
        System.out.println("------ ");
        return sv;
    }

    StudentDesign inputDataStudentDesign() {
        System.out.println("------ ");
        System.out.print("Mã Sinh Viên = ");
        String id = sc.nextLine();
        System.out.print("Tên Sinh Viên = ");
        String fullName = sc.nextLine();
        System.out.print("Giới Tính = ");
        String gender = sc.nextLine();
        System.out.print("Chuyên Ngành = ");
        String major = sc.nextLine();
        System.out.print("kỹ thuật vẽ = ");
        String paint = sc.nextLine();
        System.out.println("------ ");
        return new StudentDesign(id, fullName, gender, major, paint);
    }
    public void outputDataStudent() {
        listStudent.forEach(e ->{
            e.outputData();
        });
    }
}
