package com.buoi3_2805_javaCore;

import java.util.Scanner;

public class chanLe {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Nhập số nguyên : ");
        int soNguyen = scanner.nextInt ();

        if (soNguyen % 2 == 0) {
            System.out.println ("Là số chẵn : " + soNguyen);
        } else {
            System.out.println ("Là số lẻ : " + soNguyen);
        }
    }
}
