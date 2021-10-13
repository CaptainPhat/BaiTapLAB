/*
* create date: 13 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class testCar {
    public static void main(String[] args) {
        car Car1 = new car("Nguyen Tuan Phat", "lamborghini", "aventador SVJ", 56.16);
        Car1.show();
        System.out.printf("\n");
        car Car2 = new car("Nguyen Tuan Phat", "Toyota", "vios", 56.16);
        Car2.show();
    }
}
