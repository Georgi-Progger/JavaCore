package com.georhuga.javacore.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("gdgsgf");
        int i = -4;
        pw.println(i);

    }
}
