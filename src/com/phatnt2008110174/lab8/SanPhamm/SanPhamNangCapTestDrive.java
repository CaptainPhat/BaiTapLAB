/*
* create date: 28 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab8.SanPhamm;

import java.util.ArrayList;
import java.util.List;

public class SanPhamNangCapTestDrive {
    public static void main(String[] args) {
        List<SanPhamNangCap> list;
        list = new ArrayList<>();
        SanPhamNangCap sanpham = new SanPhamNangCap("RTX 3090", 1000.0);
        SanPhamNangCap sanpham2 = new SanPhamNangCap("RTX 3080", 899.99, 777.77);
        list.add(sanpham);
        list.add(sanpham2);
        for (int i = 0 ; i < list.size(); i++){
            SanPhamNangCap SanPhamNangCap = list.get(i);
            SanPhamNangCap.Xuat();
        }
    }
}
