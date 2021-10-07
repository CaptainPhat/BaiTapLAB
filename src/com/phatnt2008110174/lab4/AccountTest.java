/*
* create date: 30 thg 9, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab4;

public class AccountTest {
   public static void main(String[] args) {
      Account account = new Account(1234,5000);
      account.showdata();
      account.guitien();
      account.ruttien();
     
      Customer customer = new Customer();
      customer.getname();
      customer.getaddress();
      customer.phone_number();
      customer.showdata_customer();

      Employee employee = new Employee();
      employee.getname();
      employee.getslary();
      employee.showdata_Employee();
   }
    
}
