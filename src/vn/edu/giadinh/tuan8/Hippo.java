/*
* create date: 24 thg 10, 2021
* author: captainPhat
*/
package vn.edu.giadinh.tuan8;

public class Hippo extends Animal {
    Hippo(){
        System.out.println("making a hippo");
    }
    public Hippo(String n){
        super(n);
    }
    protected void makeNoise(){
        System.out.println("hipo hipo");
    }
    protected void Eat (){
        System.out.println("an ngau nghien");
    }
}
