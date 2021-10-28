/*
* create date: 20 thg 10, 2021
* author: captainPhat
*/
package com.phatnt2008110174.lap6;

public class Test {
    public static void main(String[] args) {
        Circle Tron = new Circle();
        Triangle tamGiac = new Triangle();
        Square Vuong = new Square();
        Amoeba amoeba = new Amoeba(5, 19);
        tamGiac.xoay();
        tamGiac.phatRaAmThanh();
        Vuong.xoay();
        Vuong.phatRaAmThanh();
        Tron.xoay();
        Tron.phatRaAmThanh();
        amoeba.xoay();
        amoeba.phatRaAmThanh();
    }
}
