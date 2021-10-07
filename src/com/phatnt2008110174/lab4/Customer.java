/*
* create date: 02 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab4;

import java.util.Scanner;

public class Customer {
    String Customer_name;
    String Customer_address;
   String number,Customer_number;
    String name , address;
    Scanner nhap = new Scanner(System.in);
    Customer()
    {
        // Customer_name = name;
        // Customer_address = address;
        // Customer_number = number;
    }
   void getname()
    {
       System.out.println("nhap ten: ");
        String name = nhap.nextLine();
        Customer_name = name;
        
    }
    void getaddress()
    {
        System.out.println("address = so nha - ten duong - phuong - quan - tp ;"); 
        System.out.print("Dia chi: ");
        String address = nhap.nextLine();
        Customer_address = address;
    }
    void phone_number ()
    {
      System.out.println("nhap so dt: ");
        number = nhap.nextLine();
        Customer_number = number;
    }
    void showdata_customer()
    {
        System.out.println("Customer_name"+" : "+Customer_name);
        System.out.println("Customer_address : "+Customer_address);
        System.out.println("Customer_phone_number: "+Customer_number);
    }
}
