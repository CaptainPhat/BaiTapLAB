package vn.edu.giadinh.tuan2.baitaplamquen;

import java.util.Scanner;

public class tinhToan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        double KetQa = Math.sqrt(n);
        System.out.printf("ket qua la: %.2f ", KetQa);
     }
}
