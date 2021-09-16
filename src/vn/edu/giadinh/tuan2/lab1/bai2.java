package vn.edu.giadinh.tuan2.lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai ");
        int a = sc.nextInt();
        System.out.println("nhap chieu rong: ");
        int b = sc.nextInt();
        System.out.println("chu vi hcn:( "+a+" + "+b+")/ 2 = "+((a+b)/2));
        System.out.println("dien tich hcn: "+a+" * "+b+" = "+(a*b));
       System.out.println("canh dai nhat"+Math.max(a, b));
    }
}
