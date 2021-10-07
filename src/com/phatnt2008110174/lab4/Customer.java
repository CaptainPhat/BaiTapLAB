/*
* create date: 02 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab4;

import java.util.Scanner;

public class Customer {
    String Customer_name;
    String Customer_address;
    Scanner nhap = new Scanner(System.in);
    Customer(String name, String address)
    {
        Customer_name = name;
        Customer_address = address;
    }
   void getname( String name)
    {
       System.out.println("nhap ten: ");
        name = nhap.nextLine();
        System.out.println("Customer_name"+" : "+Customer_name);
    }
    void getaddress(String address )
    {
        System.out.print("Dia chi: ");
        address = nhap.nextLine();
        System.out.println("address = so nha - ten duong - phuong - quan - tp ;"); 
    }
}
