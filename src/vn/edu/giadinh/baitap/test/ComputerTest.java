/*
* create date: 14 thg 10, 2021
* author: captainPhat
*/
package vn.edu.giadinh.baitap.test;

public class ComputerTest {
    public static void main(String[] args) {
         Computer computer1 = new Computer();
         int tong1 = computer1.tong(5, 6);
         System.out.println(tong1);
         int tong2 = computer1.tong(1,2 , 3);
         System.out.println(tong2);
    }
   
}
