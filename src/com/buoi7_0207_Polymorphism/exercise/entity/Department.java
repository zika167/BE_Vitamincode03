package com.buoi7_0207_Polymorphism.exercise.entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int departmentId;
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department(int departmentId, String departmentName, ArrayList<Employee> employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static String printNumberOfEmployees(Department department) {
        return String.valueOf(department.getEmployees().size());
    }

    public static void printNumberOfEmployeesByRole(Department department) {
        System.out.println("Phòng ban: " + department.getDepartmentName());
        System.out.println("Tổng số lượng nhân viên: " + department.getEmployees().size());
        int numOfStaff = 0;
        int numOfManager = 0;

        for ( Employee e : department.getEmployees()) {
            if ( e instanceof Staff ) {
                numOfStaff++;
            } else if ( e instanceof Manager ) {
                numOfManager++;
            }
        }

        System.out.println("Số lượng staff: " + numOfStaff);
        System.out.println("Số lượng manager: " + numOfManager);
    }

    public Employee getEmployee(int id) {
        for(Employee employee : this.getEmployees()) {
            if(employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}


