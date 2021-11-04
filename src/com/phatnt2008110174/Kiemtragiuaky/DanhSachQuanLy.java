/*
* create date: 04 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.Kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLy {
    private ArrayList<Object> list = new ArrayList<>();
   public void themNguoi(Object object){
       list.add(object);
   }
   public void inDanhSach(){
       for (Object obj: list){
           System.out.println(obj.toString());
       }
   }
}
