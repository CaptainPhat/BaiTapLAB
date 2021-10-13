/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

import java.util.Scanner;

public class Account {
    int account_number;
    int account_balance;
    Scanner nhap = new Scanner(System.in);
   Account(int Number , int Balance)
   {
       account_number = Number;
       account_balance =Balance;
   }
    void showdata ()
     {
         System.out.println("Account number: "+ account_number);
         System.out.println("Account balance: "+ account_balance);
     }
     void guitien()
     {
         int tiengui;
         System.out.println("nhap so tien can gui: ");
         tiengui = nhap.nextInt(); 
         account_balance += tiengui;
         System.out.println("account_balance"+account_balance);
     }
     void ruttien()
     {
         int tienrut;
         System.out.println("nhap so tien can rut: ");
         tienrut = nhap.nextInt();
         account_balance -= tienrut;
         System.out.println("account_balance"+account_balance);
     }
}
