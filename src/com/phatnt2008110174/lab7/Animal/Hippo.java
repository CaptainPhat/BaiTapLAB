/*
* create date: 24 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Hippo extends Animal {
    Hippo(){}
    Hippo(String name,String picture, String food, int hunger, String location) {
        super(name, picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    public void makeNoise(){
        System.out.println("hipo hipo");
    }
    public void Eat (){
        System.out.println("an ngau nghien");
    }
}
