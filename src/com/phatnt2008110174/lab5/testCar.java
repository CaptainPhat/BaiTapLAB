/*
* create date: 13 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class testCar {
    public static void main(String[] args) {
        Car Car1 = new Car("Nguyen Tuan Phat", "lamborghini", "aventador SVJ", 56.16);
        Car1.show();
        System.out.printf("\n");
        Car Car2 = new Car("Nguyen Tuan Phat", "Toyota", "vios", 56.16);
        Car2.show();
    }
}
