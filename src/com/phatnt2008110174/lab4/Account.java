/*
* create date: 30 thg 9, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab4;

import java.util.Scanner;

public class Account {
   int account_number;
   int account_balance;
   Scanner nhap = new Scanner(System.in);
  Account(int a , int b)
  {
    a = nhap.nextInt();
    b = nhap.nextInt();
      account_number = a;
      account_number = b;
  }
   void showdata ()
    {
        System.out.println("Account number: "+ account_number);
        System.out.println("Account balance: "+ account_balance);
    }
    void guitien(int tiengui)
    {
        System.out.println("nhap so tien can gui: ");
        account_balance = nhap.nextInt(); 
        account_balance += tiengui;
        System.out.println(account_balance);
    }
    void ruttien(int tienrut)
    {
        System.out.println("nhap so tien can rut: ");
        account_balance = nhap.nextInt();
        account_balance -= tienrut;
        System.out.println(account_balance);
    }
}
