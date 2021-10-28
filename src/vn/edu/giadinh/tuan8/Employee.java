/*
* create date: 28 thg 10, 2021
* author: captainPhat
*/
package vn.edu.giadinh.tuan8;

public class Employee extends Person {
    private int Salary;
    public String toString (){
        String s;
        s = getName() + ", " +getBirthDay();
        s += " , " + Salary;
        return s;
    }
}
