/*
* create date: 02 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab4;

import java.util.Scanner;

public class Employee {
   int Employee_salary;
   int salary; 
   String name;
   String Employee_name;
   Scanner nhap = new Scanner(System.in);
    Employee ()
    {
        // Employee_salary = salary;
        // Employee_name = name ;
    }

    void getname( )
    {
        System.out.println("nhap ten nhan vien: ");
        String name = nhap.nextLine();
        Employee_name = name ;
        
    }
    void getslary ()
    {
        int tienluong = 500;
        System.out.println("tien luong: "+tienluong+"$ ");
        Employee_salary = tienluong ;
    }
    void showdata_Employee()
    {
        System.out.println("Employee_name"+" : "+Employee_name);
        System.out.println("Employee_salary: "+ Employee_salary);
    }
}