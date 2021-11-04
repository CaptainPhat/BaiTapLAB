/*
* create date: 04 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.Kiemtragiuaky;


public class HocVien extends Nguoi{
    private float diemMonhoc1 ;
    private float diemMonhoc2;
    private static int soLuongHV;
    
    public HocVien (){
        super();
        soLuongHV++;
        setDiemMonhoc1();
        setDiemMonhoc2();
    }
    public void setDiemMonhoc1 (){
        do {
            System.out.println("nhap diem mon 1 : ");
            diemMonhoc1= n.nextFloat();
        }while (diemMonhoc1 < 0 && diemMonhoc1 > 10);
    }

    public void setDiemMonhoc2 (){
        do {
            System.out.println("nhap diem mon 2 : ");
            diemMonhoc2= n.nextFloat();
        }while (diemMonhoc2 < 0 && diemMonhoc1 > 10);
    }

   

    protected float diemTB(){
         return (diemMonhoc1 + diemMonhoc2)/2;
    }


    @Override
    public String toString() {
        return super.toString() + diemTB()+" " + "So luong HV: "+ soLuongHV;
    }
}
