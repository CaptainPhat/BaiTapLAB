/*
* create date: 13 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class testBook {
    public static void main(String[] args) {
        book sach1 = new book();
        sach1.getloai("kinh di");
        sach1.getnhaxuatban("Phat Nguyen");
        sach1.getnamxuatban(2021);
        sach1.getgianhap(5000);
        sach1.getgiaxat(10000);
        sach1.getsoluong(50);
        sach1.showbook();
    }
}
