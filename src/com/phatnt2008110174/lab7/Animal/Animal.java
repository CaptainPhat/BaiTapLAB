/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lab7.Animal;

public class Animal {
    public Animal(){   
    }
    public Animal(String name, String picture, String food , int hunger,String location)
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
    private String name;
  public  void makeNoise(){
        System.out.println("AAAA");
    } 
    public void Eat(){
            System.out.println("an binh thuong");
    }
    public void Sleep(){
        System.out.println("dang ngu");
    }
    public void Roam(){
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void thongTin(){
        System.out.println("Toi la: "+getName()+"toi co tam hinh dep ne: "+getPicture()+"do doi bung cua toi: "+ getHunger()+"do an cua toi la: "+ getFood()+"noi o cua toi: "+getLocation());
    }
}
