package com.example.activity;

import android.app.Activity;

public class LessonOne  extends Activity {

    public static void main(String[] args) {

        System.out.print("Welcome to the first lesson!!!     ");
        System.out.println("Welcome to the first lesson!!!");
        System.out.println();
        System.out.println("Welcome to the first lesson!!!");

        byte a = 5;
        short a1 = -10;
        int a2 = 10000;
        long a3 = 100000000000L;
        long a4 = 100000000000l;
        float a5 = 3.14F;
        float a6 = 3.14f;
        double a7 = 3.14;
        char a8 ='a';
        char a9= 200;
        char a10= '\u1234';
        char a11= '\u11AB';
        boolean a12= false;

        System.out.println(a11);

        int d = 11;
        int k = 3;

        int celoeChislo = d/k;
        int ostatok = d%k;

        System.out.println(celoeChislo);
        System.out.println(ostatok);

        int p = 3;
        int n = 5;

        boolean o = !(n==p);
        System.out.println(o);
        System.out.println(!o);


        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;

        result = i2/d1 + d2%i1 - l;
        System.out.println(result);

        int j = 5;
        int h = 8;
        System.out.println(j-- - --j + ++j +j++ +j);
        System.out.println(++h - h++ + ++h - --h);


    }
}
