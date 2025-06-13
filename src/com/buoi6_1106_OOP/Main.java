package com.buoi6_1106_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Mãng động - ArrayList
//      ArrayList<Integer> arr3 = new ArrayList<Integer>();
//      List<Integer> arr3 = new ArrayList<Integer>();
//        do {
//            System.out.print("Giá trị của phần tử = ");
//            int numberVal = sc.nextInt();
//            arr3.add(numberVal);
//            System.out.print("Nhập tiếp hông (y/n) >> ");
//            String answer = sc.next();
//            if (!answer.equals("y")) {
//                break;
//            }
//        } while (true);
//        // foreach | lambda
//        arr3.forEach((e) -> { System.out.println("arr >> "+e); });

        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        do {
            System.out.println("Gia tri cua phan tu = ");
            int number = sc.nextInt();
            arr.add(number);
            System.out.println("Nhap tiep khong (y/n) = ");
            String choice = sc.next();
            if(!choice.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);

        for (int e : arr) System.out.println("arr >> " + e);
    }
}