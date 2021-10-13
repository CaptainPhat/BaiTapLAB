/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class book {
    int gianhap,giaban,soluong,namxuatban;
    String nhaxuatban,loai;
    void getgianhap(int a)
    {
        gianhap=a;
    }
    void getgiaxat(int a)
    {
        giaban = a;
    }
    void getsoluong(int a)
    {
        soluong = a;
    }
    void getnamxuatban(int a)
    {
        namxuatban = a;
    }
    void getnhaxuatban(String a)
    {
        nhaxuatban = a;
    }
    void getloai(String aloai)
    {
        loai =  aloai;
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
