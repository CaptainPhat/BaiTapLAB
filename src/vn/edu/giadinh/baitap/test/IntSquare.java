/*
* create date: 21 thg 10, 2021
* author: captainPhat
*/
package vn.edu.giadinh.baitap.test;

public class IntSquare {
    private int squareValue;
    public IntSquare (int i){
        squareValue = i;
    }
    
    private int calculateSquare(){
        return (int) Math.pow(squareValue, 2);
    }
    public int getSquare(){
          return calculateSquare();
     }

}
