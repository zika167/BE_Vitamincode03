package com.buoi4_0306_arrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        do {
            int number = 0;
            SinhVien sv = new SinhVien();
            System.out.printf("Giá trị của phần tử %d: \n", number + 1);
            System.out.println("----------------");
            System.out.println("Tên sinh viên: ");
            sv.setName(sc.nextLine());
            System.out.println("Giới tính: ");
            sv.setSex(sc.nextBoolean());
            System.out.println("Ngành: ");
            sv.setMajor(sc.nextLine());
            listSinhVien.add(sv);
            System.out.println("Nhap tiep khong Y/N >>> ");
            String answer = sc.next();
            if (!answer.equals("Y")) break;
            number++;
        } while (true);

        for (SinhVien e : listSinhVien) {
            System.out.println("----------------");
            System.out.println("Tên sinh viên: " + e.getName());
            System.out.println("Giới tính: " + e.getSex());
            System.out.println("Ngành: " + e.getMajor());
            System.out.println("----------------");
        }
    }
}
