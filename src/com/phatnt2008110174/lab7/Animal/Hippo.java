/*
* create date: 24 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Hippo extends Animal {
    Hippo(){}
    Hippo(String picture, String food, int hunger, String location) {
        super(picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    protected void makeNoise(){
        System.out.println("hipo hipo");
    }
    protected void Eat (){
        System.out.println("an ngau nghien");
    }
}
