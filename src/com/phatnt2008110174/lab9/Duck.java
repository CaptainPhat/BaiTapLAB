/*
* create date: 09 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab9;

import com.phatnt2008110174.lab7.Animal.Animal;

public class Duck extends Animal {

    Duck() {
        super();
        //TODO Auto-generated constructor stub
    }
    Duck(String name,String picture, String food, int hunger, String location) {
        super(name,picture, food, hunger, location);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void makeNoise() {
        System.out.println(" quác quác ");
    }
}
