/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab6;

public class Amoeba {
    String amThanh =  "ret ret.hif";
    boolean Click = false;
    Amoeba(int xx , int yy){
        x = xx;
        y = yy;
    }
    int x,y;
     void xoay()
     {
         System.out.println("da xoay theo toa do x = "+x+", y= "+y);
         Click = true;
     }
    void phatRaAmThanh()
     {
        if (Click = true)
        {
            System.out.println("insert am thanh hinh Amoeba: "+amThanh);
        }
        else
        {
            System.out.println("chua bam nut kia!!!");
        }
     }
}
