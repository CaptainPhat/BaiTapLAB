/*
* create date: 02 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab8.SinhVien;

public class TestSinhvien {
    public static void main(String[] args) {
        SinhVienIT sinhVienIT = new SinhVienIT("Nguyen Tuan Phat",7.0,7.0, 7.0);
        sinhVienIT.getDiem();
        sinhVienIT.getHocLuc();
        SinhVienBiz sinhVienBiz = new SinhVienBiz("Nguyen Cat Tuong Van", 10.0, 10.0);
       sinhVienBiz.getDiem();
        sinhVienBiz.getHocLuc();
    }
}
