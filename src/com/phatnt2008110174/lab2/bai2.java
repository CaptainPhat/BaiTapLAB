package com.phatnt2008110174.lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2 co dang: ax^x+bx+c=0");
        System.out.print("nhap he so a: ");
        int a = sc.nextInt();
        System.out.print("nhap he so b: ");
        int b = sc.nextInt();
        System.out.print("nhap he so c: ");
        int c = sc.nextInt();
        double delta = (Math.pow(b,2)-(4*a*c));
        
        if (a == 0)
        {
            System.out.println("phuong trinh la phuong trinh bac 1: ");
            System.out.println("nghiem phuong trinh la: "+-b+" / "+a+"= "+(-b/a));
        }
        else
        {
            if( delta > 0)
            {
                System.out.println("phuong trinh co 2 nghiem phan biet: ");
                System.out.println("delta = "+b+" ^2  - 4 "+a+"*"+c+(delta));
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta)/(2*a));
                System.out.println("x1 = "+-b+"-"+Math.sqrt(delta)+"/ 2 * "+a+" = "+x1);
                System.out.println("x1 = "+-b+"+"+Math.sqrt(delta)+"/ 2 *"+a+" = "+x2);
            }
            else 
            {
                if  (delta == 0)
                {
                    System.out.println("phuong trinh co nghiem kep:");
                    System.out.println("delta = "+b+" ^2  - 4 "+a+"*"+c+(delta));
                    double x = -b/2*a;
                    System.out.println("x = "+-b+" * "+a+" = "+ x);
                }
                else 
                {
                    System.out.println("phuong trinh vo nghiem.");
                }
            }
        }
    }
}
