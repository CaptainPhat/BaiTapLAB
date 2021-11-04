/*
* create date: 04 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.Kiemtragiuaky;

public class QuanLyTestDrive {
    public static void main(String[] args) {
       DanhSachQuanLy list = new DanhSachQuanLy();
        HocVien hocVien = new HocVien();
        NhanVien nhanVien = new NhanVien();
        KhachHang khachHang = new KhachHang();
        list.themNguoi(hocVien);
        list.themNguoi(nhanVien);
        list.themNguoi(khachHang);
        list.inDanhSach();
    }
}
