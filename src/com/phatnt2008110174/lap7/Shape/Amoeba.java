/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap7.Shape;

public class Amoeba extends Shape {
    int x;
    int y;
   
    Amoeba(int xx, int yy,String s){
        x = xx;
        y = yy;
        Sound = s;
    }
     public void Rotate()
     {
       System.out.println("da xay 360 voi toa do x= "+ x + " va y = "+ y);
     }
    public void playSound()
     {
        System.out.println("insert am thanh .HIF: "+ Sound);
     }
}
