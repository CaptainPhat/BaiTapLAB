/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class Employee {
    String name,address,birth,job,gioitinh;
    int salary;
    Employee(String Name, String Address, String date, String Job, String Gioitinh ,int luong)
    {
        name = Name;
        address = Address;
        birth = date;
        job = Job;
        gioitinh = Gioitinh;
        salary = luong;
    }
    void showEmloyee()
    {
        System.out.println("Ten: "+name);
        System.out.println("Ngay sinh: "+birth);
        System.out.println("Gioi tinh: "+gioitinh);
        System.out.println("Dia chi: "+address);
        System.out.println("Cong viec: "+ job);
        System.out.println("Luong: "+salary);
    }
}
