package vn.edu.giadinh.tuan2.lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] bai1) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("nhap ten");
      String name = sc.nextLine();
      System.out.println("nhap diemtb");
      int diemtb = sc.nextInt();
      System.out.println("Ho ten: "+name+" DiemTB "+diemtb);
    }
}
