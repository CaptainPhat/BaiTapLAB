/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class Cow {
    int age;
    double kg;
    String Loai;
    Cow(Double Weight, String loai)
    {
        kg = Weight;
        age = 1;
        Loai = loai;
    }
    void show ()
    {
        System.out.println("can nang: "+ kg);
        System.out.println("tuoi: "+age);
        System.out.println("loai: "+Loai);
    }
}
