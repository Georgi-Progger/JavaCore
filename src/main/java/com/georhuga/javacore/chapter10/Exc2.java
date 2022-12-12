package com.georhuga.javacore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42/ d;
            System.out.println("Это не напечатается");

        } catch (ArithmeticException e){
            System.out.println("Деление на нуль");
        }
    }
}
