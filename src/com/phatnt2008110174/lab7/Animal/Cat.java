/*
* create date: 24 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Cat extends Feline {
    public Cat(){}
    public Cat(String name,String picture, String food, int hunger, String location) {
         super(name, picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    public void makeNoise(){
        System.out.println("meo meo");
    }
    public void Eat(){
        System.out.println("neko dang an");
    }
}
