/*
* create date: 14 thg 10, 2021
* author: captainPhat
*/
package vn.edu.giadinh.baitap.test;

public class TestDog {
    public static void main(String[] args) {
          Dog dog1 = new Dog();
        String name = "pun";
        dog1.age =1;
        dog1.name = name;
        System.out.println("ten: "+dog1.name);
        System.out.println("tuoi: "+ dog1.age);
        // dog1.woo();
        dog1.bark(3);
        int size = dog1.getsize();
    }
  
}
