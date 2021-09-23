package com.phatnt2008110174.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner nhapn = new Scanner(System.in);
        System.out.print(" nhap n: ");
        int n = nhapn.nextInt();
        int[] a = new int[50]; 
        int tam;
        for (int i = 0; i<n;i++)
        {
            System.out.print("a[" + i + "] = ");
           a[i]=nhapn.nextInt();
        }
       for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j<n ; j++)
            {
                if (a[i]>a[j])
                {
                    tam=a[i];
                    a[i]=a[j];
                    a[j]=tam;
                }
            }
        }
        System.out.println("bat xuat mang");
        for (int i = 0; i<n ; i++ )
        {
            System.out.printf("a[%d] = %d\n",i , a[i] );
        }
        int min = a[0];
        for (int i = 0; i < n ; i++)
        {
           min = Math.min(min, a[i]);
        }
        System.out.println("so nho nhat trong mang la: "+ min);
        int tong = 0;
        for (int i = 0; i < n ; i++)
        {
            if(a[i]%3==0)
            {
                tong += a[i];
            }
        }
       System.out.print("tong la: "+tong);
    }
}
