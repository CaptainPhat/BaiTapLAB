/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package vn.edu.giadinh.Test;

import java.util.jar.Attributes.Name;

public class Animal {
    public Animal(){
        System.out.println("making Animal...");
    }
    
    protected String Picture;
    protected String Food;
    protected int Hunger;
    protected int location;
    private String Name;
    public Animal(String n ){
        Name =n;
    }
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
public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}
}
