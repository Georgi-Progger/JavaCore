package com.georhuga.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        String text = "Hello world!"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("C:\\Users\\User\\OneDrive\\Рабочий стол\\poleznosti (1).txt".replace("\\","//")))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
