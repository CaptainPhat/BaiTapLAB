/*
* create date: 24 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Animal;

public class Cat extends Feline {
   Cat(){
   }
    Cat(String picture, String food, int hunger, String location) {
        super(picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    protected void makeNoise(){
        System.out.println("meo meo");
    }
    protected void Eat(){
        System.out.println("neko dang an");
    }
}
