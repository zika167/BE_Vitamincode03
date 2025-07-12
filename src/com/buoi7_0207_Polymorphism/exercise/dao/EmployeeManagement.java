package com.buoi7_0207_Polymorphism.exercise.dao;

import com.buoi7_0207_Polymorphism.exercise.entity.Department;
import com.buoi7_0207_Polymorphism.exercise.entity.Employee;

import java.util.List;

public interface EmployeeManagement {
    void themPhongBan(List<Department> departments, Department d);

    void themThanhVien(List<Department> departments, Employee e);
}
