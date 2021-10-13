/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class car {
    String tenchuxe,hang,giayphep,loai;
   double soluong;
    car (String chuxe, String hsx, String dong, double xang)
    {
        tenchuxe = chuxe;
        hang = hsx;
        loai = dong;
        soluong = xang;
        
    }
    void show()
    {
        System.out.println("chu xe: "+ tenchuxe);
        System.out.println("hang san xuat: "+hang);
        System.out.println("dong xe: "+ loai);
        // System.out.println("giay phep: "+giayphep);
        System.out.println("dung tich binh xang: "+ soluong+" lit");
    }
}
