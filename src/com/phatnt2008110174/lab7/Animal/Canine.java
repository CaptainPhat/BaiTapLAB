/*
* create date: 28 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Canine extends Animal{
    public Canine(){   
    }
    public Canine(String name,String picture, String food, int hunger, String location) {
        super(name, picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Roam() {
        System.out.println("di theo bay");
    }
}
