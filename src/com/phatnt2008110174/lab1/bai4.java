package com.phatnt2008110174.lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2 co dang: ax^x+bx+c=0");
        System.out.println("nhap he so a: ");
        int a = sc.nextInt();
        System.out.println("nhap he so b: ");
        int b = sc.nextInt();
        System.out.println("nhap he so c: ");
        int c = sc.nextInt();
        double delta = (Math.pow(b,2)-(4*a*c));
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta)/(2*a));
        System.out.println("x1 = "+-b+"-"+Math.sqrt(delta)+"/ 2 * "+a+" = "+x1);
        System.out.println("x1 = "+-b+"+"+Math.sqrt(delta)+"/ 2 *"+a+" = "+x2);
    }
}
