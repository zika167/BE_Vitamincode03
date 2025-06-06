package com.buoi4_0306_arrayList;

public class SinhVien {
    String name;
    Boolean sex;
    String major;

    public SinhVien() {
    }

    public SinhVien(String name, Boolean sex, String major) {
        this.name = name;
        this.sex = sex;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
