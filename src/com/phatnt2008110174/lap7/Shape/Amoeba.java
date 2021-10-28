/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Shape;

public class Amoeba extends Shape {
  protected int x;
  protected int y;
   
   protected Amoeba(int xx, int yy,String s){
        super(s);
        x = xx;
        y = yy;
        Sound = s;
    }
    protected void Rotate()
     {
       System.out.println("da xay 360 voi toa do x= "+ x + " va y = "+ y);
     }
     protected void playSound()
     {
        System.out.println("insert am thanh .HIF: "+ getSound());
     }
}
