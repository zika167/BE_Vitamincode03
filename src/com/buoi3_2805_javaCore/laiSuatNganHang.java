package com.buoi3_2805_javaCore;

import java.util.Scanner;

public class laiSuatNganHang {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Nhập số tiền gốc : ");
        double P = scanner.nextDouble ();
        System.out.println ("Nhập số năm : ");
        int T = scanner.nextInt ();
        double R = 0.8 ;
        double laiSuat = (P * T * R) / 100 ;

        System.out.println ("Lãi xuất nhận được : " + laiSuat);
    }
}
