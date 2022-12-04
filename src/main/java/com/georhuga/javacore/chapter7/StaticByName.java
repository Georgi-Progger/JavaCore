package com.georhuga.javacore.chapter7;

class Simple {
    static int a;
    static int b;
}
public class StaticByName {
    public static void main(String[] args) {
        Simple myA = new Simple();
        Simple myB = new Simple();
        myA.a = 1;
        myA.b = 2;
        myB.a = 3;
        myB.b = 4;
        System.out.println(myA.a + myA.b + myB.a + myB.b);
    }
}
