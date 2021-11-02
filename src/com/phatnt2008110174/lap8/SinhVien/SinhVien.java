/*
* create date: 02 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap8.SinhVien;

public class SinhVien {
    private String hoTen;
    private String Nganh;
    
    public SinhVien (String hoTen,String Nganh)
    {
        this.hoTen = hoTen;
        this.Nganh = Nganh;
    }
    protected double getDiem() {
        return  getDiem();
    }
    protected void getHocLuc(){
        if (getDiem()<5)
            System.out.println("hoc luc yeu");
        else 
                if (getDiem()>=5 && getDiem() <=6.5)
                    System.out.println("hoc luc trung binh");
                else 
                    if (getDiem() >= 6.5 && getDiem() <= 7.5)
                        System.out.println("hoc luc kha");
                    else
                        if (getDiem()>= 7.5 && getDiem() <= 9)
                            System.out.println("hoc sinh gioi");
                        else 
                            if (getDiem() > 9 )
                                System.out.println("hoc sinh xuat sac");
    }
}
