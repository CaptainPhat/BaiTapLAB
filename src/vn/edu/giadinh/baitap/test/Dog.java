/*
* create date: 14 thg 10, 2021
* author: captainPhat
*/
package vn.edu.giadinh.baitap.test;

public class Dog {
    String breed;
    String color;
    String name;
    int age;
    int size;
   void woo(){
       System.out.println("woo woo woo");
   }
   void duoiMeo(){
       System.out.println("duoi meo");
   }
   void bark(int numofBarks)
   {
       while (numofBarks > 0)
       {
            System.out.println("Woo");
            numofBarks--;
       }
   }
   public int getsize(){
       return size;
   }
}
