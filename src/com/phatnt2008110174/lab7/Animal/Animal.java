/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Animal {
    Animal(){   
    }
    Animal(String picture, String food , int hunger,String location)
    {
       System.out.println("hinh anh: "+(Picture = picture)); 
        System.out.println("thuc an: "+(Food = food)); 
        System.out.println("muc do doi: "+(Hunger = hunger)); 
        System.out.println("dia diem sinh hoat: "+(Location = location));    
    }
    private String Picture;
    private String Food;
    private int Hunger;
    private String Location;
  protected  void makeNoise(){
        System.out.println("AAAA");
    } 
   protected void Eat(){
            System.out.println("an binh thuong");
    }
   protected void Sleep(){
        System.out.println("dang ngu");
    }
   protected void Roam(){
        System.out.println("di lang thang");
    }
    
    public String getPicture() {
        return Picture;
    }
   
    public String getFood() {
        return Food;
    }

    public int getHunger() {
        return Hunger;
    }

    public String getLocation() {
        return Location;
    }
}
