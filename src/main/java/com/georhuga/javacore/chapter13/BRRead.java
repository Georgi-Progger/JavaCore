package com.georhuga.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main ( String args[] ) throws IOException
    {
        byte c;
        BufferedReader br = new BufferedReader ( new
                InputStreamReader(System.in));
        System.out.println ( "Bвeдитe символы, 'q' - для выхода.") ;
        do {
            c = (byte) br.read();
            System.out.write(c);
        }while (true);
    }
}
