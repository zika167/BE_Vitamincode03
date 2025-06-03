package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AL{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Thai");
        System.out.println();
        // Mảng: Là tập hợp huwx hạn các phần tử có cùng kiểu dữ liệu
        int[] arr1 = new int[5];
        arr1[0] = 1;
        System.out.println(">>> " + arr1[0]); // >>> xài 1/5 bộ nhớ
        // Mảng động - ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        do {
            int number = 0;
            System.out.printf("Giá trị của phần tử %i: \n", number + 1);
            int numberValue = sc.nextInt();
            arr2.add(numberValue);
            System.out.println("Nhap tiep khong Y/N >>> ");
            String answer = sc.next();
            if (!answer.equals("Y")) break;
            number++;
        } while (true);
        // forEach | lambada
        arr2.forEach((Integer e) -> {
            System.out.println("Arr >> " + e);
        });

    }
}
