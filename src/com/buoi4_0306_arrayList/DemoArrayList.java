package com.buoi4_0306_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm theo ID");
            System.out.println("4. Xoá sinh viên theo ID");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    Student s = new Student(id, name, age);
                    students.add(s);
                    System.out.println("✅ Đã thêm sinh viên!");
                    break;

                case 2:
                    System.out.println("📋 Danh sách sinh viên:");
                    for (Student st : students) {
                        System.out.println(st);
                    }
                    break;

                case 3:
                    System.out.print("Nhập ID cần tìm: ");
                    String searchId = sc.nextLine();
                    boolean found = false;
                    for (Student st : students) {
                        if (st.getId().equalsIgnoreCase(searchId)) {
                            System.out.println("🔍 Tìm thấy: " + st);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("❌ Không tìm thấy sinh viên!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập ID cần xoá: ");
                    String deleteId = sc.nextLine();
                    boolean removed = false;
                    for (Student st : students) {
                        if (st.getId().equalsIgnoreCase(deleteId)) {
                            students.remove(st);
                            System.out.println("🗑️ Đã xoá sinh viên: " + deleteId);
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("❌ Không tìm thấy sinh viên để xoá!");
                    }
                    break;

                case 0:
                    System.out.println("👋 Thoát chương trình.");
                    break;

                default:
                    System.out.println("⚠️ Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        sc.close();
    }
}
