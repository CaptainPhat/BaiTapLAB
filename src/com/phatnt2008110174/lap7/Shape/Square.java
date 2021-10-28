/*
* create date: 20 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Shape;

public class Square extends Shape{
    Square(String s){
        super(s);
    }
   protected void playSound(){
       System.out.println("insert am thanh.AIF: "+ getSound());
   }
}
