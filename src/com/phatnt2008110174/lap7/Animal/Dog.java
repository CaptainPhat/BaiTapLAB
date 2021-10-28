/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Animal;

public class Dog extends Canine {
    Dog(){
    }
    Dog(String picture, String food, int hunger, String location) {
        super(picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    protected void makeNoise(){
        System.out.println("woo woo");
    }
    protected void Eat(){
        System.out.println("con  cho dang dan");
    }
    protected void Roam(){
        System.out.println("di toi di lui trong nha");
    }
}
