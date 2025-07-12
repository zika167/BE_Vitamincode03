package com.buoi7_0207_Polymorphism.exercise.dao.impl;

import com.buoi7_0207_Polymorphism.exercise.dao.EmployeeManagement;
import com.buoi7_0207_Polymorphism.exercise.entity.Department;
import com.buoi7_0207_Polymorphism.exercise.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementImpl implements EmployeeManagement {
    public static final String INFO = "ĐÂY LÀ CHƯƠNG TRÌNH NHẬP THÔNG TIN PHÒNG BAN VÀ NHÂN VIÊN!!!";

    @Override
    public void themPhongBan(List<Department> departments, Department d) {
        if(departments.add(d)) {
            System.out.println("thanh cong!");
        } else {
            System.out.println("That bai!");
        }
    }

    @Override
    public void themThanhVien(List<Department> departments, Employee e) {
        for (Department department : departments ) {
            if(department.getDepartmentId() == e.getDepartmentId()) {
                List<Employee> employees = department.getEmployees();
                employees.add(e);
                department.setEmployees(employees);
            }
        }
    }
}
