package com.buoi6_1106_OOP.service;

import com.buoi6_1106_OOP.entity.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienService {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> listStudent = new ArrayList<>();
    public void inputListSinhVien(){
        do {
            SinhVien sv = inputDataSinhVien();
            listStudent.add(sv);
            System.out.print("Nhập tiếp hông (y/n) >> ");
            String answer = sc.nextLine();
            if (!answer.equals("y")) {
                break;
            }
        } while (true);
    }
    SinhVien inputDataSinhVien() {
            System.out.println("------ ");
            System.out.print("Mã Sinh Viên = ");
            String id = sc.nextLine();
            System.out.print("Tên Sinh Viên = ");
            String fullName = sc.nextLine();
            System.out.print("Giới Tính = ");
            String gender = sc.nextLine();
            System.out.print("Chuyên Ngành = ");
            String major = sc.nextLine();
            System.out.println("------ ");

            SinhVien sv = new SinhVien();
            sv.setId(id);
            sv.setFullName(fullName);
            sv.setGender(gender);
            sv.setMajor(major);

            return sv;
    }
    public void outputDataSinhVien() {
        listStudent.forEach(e ->{
            e.outputData();
        });
    }

    public void phanLoaiSinhVien() {
        System.out.println("=== Danh sách sinh viên IT ===");
        listStudent.stream()
                .filter(sv -> sv.getMajor().equalsIgnoreCase("IT"))
                .forEach(SinhVien::outputData);

        System.out.println("\n=== Danh sách sinh viên Design ===");
        listStudent.stream()
                .filter(sv -> sv.getMajor().equalsIgnoreCase("Design"))
                .forEach(SinhVien::outputData);

        System.out.println("\n=== Danh sách sinh viên Marketing ===");
        listStudent.stream()
                .filter(sv -> sv.getMajor().equalsIgnoreCase("Marketing"))
                .forEach(SinhVien::outputData);
    }
}
