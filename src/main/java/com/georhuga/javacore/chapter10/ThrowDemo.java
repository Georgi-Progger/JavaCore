package com.georhuga.javacore.chapter10;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("демо");
        }catch (NullPointerException e){
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            throw new NullPointerException("демо");
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
