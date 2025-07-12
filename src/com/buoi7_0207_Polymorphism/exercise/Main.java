package com.buoi7_0207_Polymorphism.exercise;

import com.buoi7_0207_Polymorphism.exercise.dao.impl.EmployeeManagementImpl;
import com.buoi7_0207_Polymorphism.exercise.entity.Department;
import com.buoi7_0207_Polymorphism.exercise.entity.Employee;
import com.buoi7_0207_Polymorphism.exercise.entity.Manager;
import com.buoi7_0207_Polymorphism.exercise.entity.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagementImpl em = new EmployeeManagementImpl();
        List<Department> listDepartment = new ArrayList<>();
//        listDepartment.add(new Department("1","Test1","",{}));

        while (true) {
            System.out.println("**** MENU ****");
            System.out.println("1. Thêm phòng ban");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Danh sách phòng ban");
            System.out.println("4. Danh sách nhân viên");
            System.out.println("5. Giới thiệu chương trình");
            System.out.println("6. Đếm số lượng nhân viên theo phòng ban");
            System.out.println("7. Đếm số lượng nhân viên theo chức vụ của từng phòng ban");
            System.out.println("8. Cập nhật info nhân viên");
            System.out.println("9. In tổng lương của từng phòng ban");
            System.out.println("0. Thoát");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập mã phòng ban: ");
                    int idDepartment = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Tên phòng ban: ");
                    String name = sc.nextLine();

                    Department d = new Department(idDepartment, name);

                    // Thêm department mới vào listDepartment trong main
                    em.themPhongBan(listDepartment, d);
                    break;

                case 2:
                    Employee e = null;

                    System.out.println("Role (Staff/Manager): ");
                    String role = sc.nextLine();
                    if(role.equalsIgnoreCase("STAFF")) e = new Staff();
                    else if (role.equalsIgnoreCase("MANAGER")) e = new Manager();

                    // Nhập info
                    System.out.println("Nhập id: ");
                    e.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Nhập tên: ");
                    e.setName(sc.nextLine());
                    System.out.println("Nhập mã phòng ban: ");
                    e.setDepartmentId(sc.nextInt());
                    sc.nextLine();

                    em.themThanhVien(listDepartment, e);
                    break;

                case 3:
                    System.out.println("Danh sách phòng ban: ");
                    for (Department dt : listDepartment) {
                        System.out.println(dt.getDepartmentName());
                    }
                    break;

                case 4:
                    System.out.println("Danh sách nhân viên: ");
                    for (Department dt : listDepartment) {
                        System.out.println("Phòng ban: " + dt.getDepartmentName());
                        for (Employee emp : dt.getEmployees()) {
                            System.out.println(emp.getName());
                        }
                    }
                    break;

                case 5:
                    System.out.println(EmployeeManagementImpl.INFO);
                    break;

                case 6:
                    for(Department dt : listDepartment) {
                        System.out.println("Phòng ban: " + dt.getDepartmentName());
                        System.out.println("Số lượng nhân viên: " + Department.printNumberOfEmployees(dt));
                    }
                    break;

                case 7:
                    for(Department dt : listDepartment) {
                        Department.printNumberOfEmployeesByRole(dt);
                    }
                    break;

                case 8:
                    System.out.println("Nhập id nhân viên cần cập nhật: ");
                    int idEmployee = sc.nextInt();
                    sc.nextLine();

                    for (Department dt : listDepartment) {
                        Employee find = dt.getEmployee(idEmployee);
                        if(Objects.isNull(find)) {
                            System.out.println("Không tìm thấy nhân viên!");
                        } else {
                            System.out.println("Cập nhật thông tin cho nhân viên id: " + find.getId());
                            System.out.println("Nhập tên: ");
                            find.setName(sc.nextLine());
                            System.out.println("Nhập mã phòng ban: ");
                            find.setDepartmentId(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Cập nhật thành công!");
                        }
                    }
                    break;

                case 0:
                    return;

                default:
            }
        }
    }
}
