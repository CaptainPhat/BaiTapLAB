/*
* create date: 02 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab8.SinhVien;

public class SinhVienIT extends SinhVien {
    private double Diem, Java,Html,Css;
    public SinhVienIT(String hoTen,Double Java,Double Html,Double Css) {
        super(hoTen, hoTen);
        this.Java = Java;
        this.Html = Html;
        this.Css = Css;
        //TODO Auto-generated constructor stub
    }
    protected double getDiem() {
        return (2*Java + Html + Css )/4;
    }
    
}
