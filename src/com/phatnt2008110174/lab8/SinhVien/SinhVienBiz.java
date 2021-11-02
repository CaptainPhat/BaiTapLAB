/*
* create date: 02 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab8.SinhVien;

public class SinhVienBiz extends SinhVien {
    private double  Marketting,Sales;
    public SinhVienBiz(String hoTen, Double Marketting,Double Sales) {
        super(hoTen,hoTen);
        this.Marketting = Marketting;
        this.Sales = Sales;
        //TODO Auto-generated constructor stub
    }
   protected double getDiem(){
       return (2* Marketting + Sales)/3;
   }
}
