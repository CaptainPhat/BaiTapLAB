/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Animal;

public class Lion extends Canine {
    Lion(){}
    Lion(String picture, String food, int hunger, String location) {
        super(picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    protected void makeNoise(){
        System.err.println("Braaaaaaa!!!");
    }
    protected void Eat(){
        System.out.println("su tu dang an");
    }
}
