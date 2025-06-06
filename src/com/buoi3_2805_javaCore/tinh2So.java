package com.buoi3_2805_javaCore;

import java.util.Scanner;

public class tinh2So {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều dài : ");
        double dai = scanner.nextDouble();
        System.out.println("Chiều rộng : ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("Chu Vi :" + chuVi);
        System.out.println("Dien Tich : " + dienTich);
        System.out.println("Canh Nho : " + canhNho);
    }
}