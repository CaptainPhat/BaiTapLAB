/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
       Scanner nhap = new Scanner(System.in);
       System.out.print("nhap so luong hoc sinh :");
       int n = nhap.nextInt();
    //    String[] ten = new String [100];
    //     String [] sa = new String[10];
        int [] ad = new int [100];
        char [] a  = new char[100];
       int stt=0;
       for (int i =1 ; i < n ; i++)
       {
            
            stt = i;
             System.out.print(stt+" ");
        // System.out.println(i);
            // System.out.print("STT:" +i+"hoc sinh ten: ");
            // System.out.printf("%d\n",i);
            // ten [i] = nhap.nextLine();
            // a [i] = nhap.nextLine();
            // sa[i] = nhap.nextLine();
            ad[i] = nhap.nextInt();
           
       }
       for  (int i =1 ; i < n+1 ; i++)
       {
        //    System.out.println("i"+i+sa[i]);
        //    System.out.println(ten[i]);
       }
    }
}
