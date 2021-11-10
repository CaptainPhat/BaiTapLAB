/*
* create date: 10 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab9;

import java.util.List;

import com.phatnt2008110174.lab7.Animal.Cat;
import com.phatnt2008110174.lab7.Animal.Dog;

public class TestDriveAnimalManagament {
    public static void main(String[] args) {
        AnimalManagament list = new AnimalManagament();
        Dog dog = new Dog("iNu", "cho.hinh", "an do an cho cho", 5, "nha");
        Cat cat = new Cat("Nekko", "Meocon.hinh", "an do an cho meo", 5, "nha");
        Duck duck = new Duck("Vinh", "hinhVit", "banh Mi", 2, "ao ho");
       list.add(dog);
       list.add(cat);
       list.add(duck);
       dog.setName("Khê ối");
       cat.setName("Phước thông minh");
       duck.setName("Phat");
       list.thongTin();
       list.Roam();
    }
}
