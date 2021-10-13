/*
* create date: 13 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class testComputer {
    public static void main(String[] args) {
        computer Computer01 = new computer("i5 10400", "RTX 3060", 512, 2000,16, 600);
        Computer01.show();
        computer Computer02 = new computer("i9 11900k", "RTX 3090", 1000, 4000, 16, 1000);
        Computer02.show();
    }
}
