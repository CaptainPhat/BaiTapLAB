package com.phatnt2008110174.lab1;

import java.util.Scanner;

public class bai3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh cua khoi lap phuong: ");
        int a = sc.nextInt();
        System.out.println("the tich lap phuong = "+a+" * "+a+" * "+a+" = "+(Math.pow(a,3)));
    }
}
