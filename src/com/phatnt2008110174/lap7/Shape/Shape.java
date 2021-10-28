/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Shape;

public class Shape {
   private String Sound;
   public Shape(String s){
        Sound  = s;
   }
   public String getSound() {
       return Sound;
   }
   public void setSound(String sound) {
       Sound = sound;
   }
    protected void Rotate()
    {
        System.out.println(" xoay 360 do");
    }
    protected void playSound(){
        System.out.println("insert am thanh quay hinh ");
    }
}
