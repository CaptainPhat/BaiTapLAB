package vn.edu.giadinh.tuan2.baitaplamquen;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       int [] a = {9,3,8,7,3,9,4,2};
       double tong = 0;
       for (int x : a)
       {
           if (x % 2 == 0 )
           {
               tong += x ;
           }
       }
       System.out.println("tong: "+tong);
      }
    }

