/*
* create date: 02 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab4;

import java.util.Scanner;

public class Employee {
   int Employee_salary;
   String Employee_name;
   Scanner nhap = new Scanner(System.in);
    Employee (int salary, String name)
    {
        Employee_salary = salary;
        Employee_name = name ;
    }

    void getname( String name)
    {
        System.out.println("nhap ten: ");
        name = nhap.nextLine();
        System.out.println("Employee_name"+" : "+Employee_name);
    }
    void getslary (int tienluong)
    {
        tienluong = 500;
        System.out.println(tienluong+" $ ");
    }
}