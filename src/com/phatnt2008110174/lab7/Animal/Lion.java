/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Lion extends Canine {
    Lion(){}
    Lion(String name,String picture, String food, int hunger, String location) {
        super(name, picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    public void makeNoise(){
        System.err.println("Braaaaaaa!!!");
    }
    public void Eat(){
        System.out.println("su tu dang an");
    }
}
