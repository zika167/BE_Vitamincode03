package com.buoi6_1106_OOP;

import com.buoi6_1106_OOP.service.SinhVienService;

public class Main02 {
    public static void main(String[] args) {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.inputListSinhVien();
        sinhVienService.outputDataSinhVien();
        sinhVienService.phanLoaiSinhVien();
    }
}
