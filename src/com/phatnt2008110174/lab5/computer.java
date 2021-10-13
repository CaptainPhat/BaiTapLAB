/*
* create date: 07 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab5;

public class computer {
    String CPU,VGA;
    int RAM,PSU,SSD,HDD;
    computer(String cpu,String vga, int ssd, int hdd,int ram, int psu )
    {
        CPU = cpu;
        VGA = vga;
        SSD = ssd;
        HDD = hdd;
        RAM = ram; 
        PSU = psu;
    }
    void show()
    {
        System.out.println("CPU: "+CPU);
        System.out.println("VGA: "+VGA);
        System.out.println("SSD: "+SSD + " GB");
        System.out.println("HDD: "+ HDD+" GB");
        System.out.println("RAM: "+RAM+" GB");
        System.out.println("Nguon: "+PSU+" W");
    }
}
