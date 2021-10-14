/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class Book {
    String loai, nhaxuatban;
    int soluong, gianhap,giaban,namxuatban;
    Book(String Loai,String tacgia, int Soluong, int Gianhap, int Giaban,int Namsanxuat)
    {
        loai = Loai;
        nhaxuatban = tacgia;
        soluong = Soluong;
        gianhap = Gianhap;
        giaban = Giaban;
        namxuatban = Namsanxuat;
    }
    void showbook()
    {
       System.out.println("loai: "+loai);
        System.out.println("so luong: "+soluong);
        System.out.println("gia nhap: "+ gianhap);
        System.out.println("gia ban: "+ giaban);
        System.out.println("nha xuat ban: "+nhaxuatban);
        System.out.println("nam san xuat: "+namxuatban);
    }
}
  
    
