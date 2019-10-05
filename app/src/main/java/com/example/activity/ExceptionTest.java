package com.example.activity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        try {
            File f = new File("test9.txt");
            System.out.println("Обьект File создался");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Поток Stream создался");
            int counter = 0;
            while (true){

                counter++;
                result.append(fis.read());
                System.out.println("Информация читается");

                if (counter == 3){
                    fis.close();
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Exception 1");

        } catch (IOException e){
            System.out.println("Exception 2");
        }
        finally {
            System.out.println("Это finally");
        }
    }
}
