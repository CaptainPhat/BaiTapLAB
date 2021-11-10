/*
* create date: 09 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab9;

import java.util.ArrayList;

import com.phatnt2008110174.lab7.Animal.Animal;
import com.phatnt2008110174.lab7.Animal.Cat;

public class AnimalManagament {
    private ArrayList<Animal> list; 
    public AnimalManagament(){
        list = new ArrayList<Animal>();
    }
    public void add (Animal animal){
        list.add(animal);
    }
    public void makeNoise(){
        for (Animal animal : list){
            animal.makeNoise();
        }
    }
    public void Roam(){
        for (Animal animal : list){
            animal.Roam();
        }
    }
    public Animal searchName (String name){
        Cat c = null;
        for (Animal animal : list){
            if ( animal instanceof Cat){
                Cat cat = (Cat)animal;
                if (cat.getName().equalsIgnoreCase(name)){
                    c = cat;
                }
            }
        }
        return c;
    }
    public void thongTin (){
        for (Animal animal : list){
            animal.thongTin();
        }
    }
}
