/*
* create date: 04 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.Kiemtragiuaky;

public class NhanVien extends Nguoi{
    private float heSoLuong;

    public NhanVien (){
        super();
        setHeSoLuong();
    }

    protected float tinhLuong(){
        return heSoLuong*1500000;
    }

    public void setHeSoLuong() {
        do{
            System.out.println("nhap  he so luong: ");
            heSoLuong = n.nextFloat();
        }while(heSoLuong <0 && heSoLuong > 10);
    }
   
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + tinhLuong();
    }
}
