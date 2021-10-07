/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
       Scanner nhapn = new Scanner(System.in);
        System.out.print("nhap so luong hoc sinh: ");
        int n = nhapn.nextInt();
        String[] ten = new String [50];
        int[] diem= new int[50];
        for (int i = 0; i<n ; i++)
        {
            System.out.println("nhap ten hoc sinh: ");
           ten[i] = nhapn.nextLine();
            System.out.println("nhap diem: ");
            diem[i] = nhapn.nextInt();
        }
        for (int i  = 0 ; i < n ; i  ++ )
        {
            System.out.println("ten " + ten);
            System.out.println("diem"+ diem);
           if (diem[i] <5 )
           {
                System.out.println("hoc luc: yeu ");
           }
           else 
           {
               if (diem[i] < 6.5 && diem[i] > 5)
               {
                 System.out.println("hoc luc: trung");  
               }
                else
                {
                    if (diem[i] >6.5 && diem[i] < 7.5 )
                    {
                        System.out.println("hoc luc: kha");
                    }
                }
           }
            
        }
    }
}
