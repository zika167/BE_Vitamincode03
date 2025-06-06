package com.buoi3_2805_javaCore;

import java.util.Scanner;

public class haiSoNguyen {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in) ;

        System.out.println ("Số a : ");
        double soA = scanner.nextDouble ();
        System.out.println ("Số b : ");
        double soB = scanner.nextDouble ();

        double tong = soA + soB ;
        double hieu = soA - soB ;
        double tich = soA * soB ;
        double thuong = soA / soB ;

        System.out.println ("Tổng : " + tong );
        System.out.println ("Hiệu : " + hieu );
        System.out.println ("Tích : " + tich );
        if (soB != 0){
            System.out.println ("Thương : " + thuong );
        } else {
            System.out.println ("Không chia hết cho 0.");
        }

        System.out.println("Anh Thái nè Hiếu, nhớ merge giúp anh:::xxxxx");
    }
}
