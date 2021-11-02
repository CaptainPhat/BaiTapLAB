/*
* create date: 28 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Canine extends Animal{
    Canine(){   
    }
    Canine(String picture, String food, int hunger, String location) {
        super(picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void Roam() {
        System.out.println("di theo bay");
    }
}
