/*
* create date: 04 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.Kiemtragiuaky;



public class KhachHang  extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    public KhachHang (){
        super();
        setTenCongTy();
        setTriGiaHoaDon();
    }

    public void setTriGiaHoaDon() {
        do{
            System.out.println("nhap gia tri hoa don");
            triGiaHoaDon = n.nextDouble();
        }while (triGiaHoaDon < 0 && triGiaHoaDon >10);
    }

    public void setTenCongTy() {
        System.out.println("nhap ten cong ty: ");
        tenCongTy = n.nextLine();
    }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return super.toString()+tenCongTy + " "+  triGiaHoaDon;
   }
}
