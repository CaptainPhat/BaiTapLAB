/*
* create date: 28 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab8.Shape;

public class Vuong extends ChuNhat{
    public Vuong (double canh){
        super(canh, canh);
    }
    protected double getChuVi(){
        return getDai() * 4;
    }
    protected double getDienTich(){
        return Math.pow(2, getDai());
    }
    protected void xuat(){
        System.out.println("canh: "+ getDai());
        System.out.println("chu vi : "+getDai()+"* 4 = "+ getChuVi());
        System.out.println("dien tich: "+ getDai()+ getDai() +" = "+ getDienTich());
    }
}
