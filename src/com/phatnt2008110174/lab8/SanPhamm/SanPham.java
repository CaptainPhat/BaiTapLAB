/*
* create date: 28 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab8.SanPhamm;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private Double donGia;
    private Double giamGia;
   
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public Double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    public Double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }
    protected double getThueNhapKhau(){
        double thue;
        thue = (donGia*10)/100;
        return thue;
    }
    protected void Xuat(){
        System.out.println("Tên Sản Phẩm: "+tenSp);
        System.out.println("Đơn Giá: "+donGia+"$");
        System.out.println("Giảm giá: "+ giamGia+"$");
        System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau()+"$");
    }
    protected void nhap(){
        Scanner n = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        tenSp= n.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = n.nextDouble();
        System.out.println("Nhập số tiền đã giảm: ");
        giamGia = n.nextDouble();
    }
}
