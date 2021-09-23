package vn.edu.giadinh.tuan3.lab3;

import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        Scanner nhapso = new Scanner(System.in);
        System.out.print("nhap mot so bat ky: ");
        int n = nhapso.nextInt();
         int tam = 0;
        for (int i = 2 ; i < n - 1 ; i ++ )
        {
            if (n%i == 0)
            {
               tam ++;
            }
           
            i++;
        }
         if (tam == 0)
            {
                System.out.println(n + " la so nguyen to");
            }
            else 
            {
                System.out.println(n + "khong la so nguyen to");
            }
     
    }  
}
