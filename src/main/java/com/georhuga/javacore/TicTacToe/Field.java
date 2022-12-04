package com.georhuga.javacore.TicTacToe;

import java.util.Arrays;

public class Field {
    public static final String S_X = "X";
    public static final String S_O = "O";
    public  static final String S_EMPTY = "_";
    private String [] storage = new String[9];

    public Field(){
        Arrays.fill(storage, S_EMPTY);
    }

    public void setItem(int i, String value) {
        this.storage[i] = value;
    }

    public String[] getStorage() {
        return storage;
    }



}