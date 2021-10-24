/*
* create date: 14 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Shape;

public class Circle extends Shape {
    Circle(String s ){
        Sound = s;
    }
   protected void playSound(){
       System.out.println("insert am thanh.AIF: "+ Sound);
   }
}
