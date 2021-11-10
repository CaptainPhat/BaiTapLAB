/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Dog extends Canine {
   public Dog(){
    }
   public Dog(String name,String picture, String food, int hunger, String location) {
        super(name, picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    public void makeNoise(){
        System.out.println("woo woo");
    }
    public void Eat(){
        System.out.println("con  cho dang dan");
    }
    public void Roam(){
        System.out.println("di toi di lui trong nha");
    }
}
