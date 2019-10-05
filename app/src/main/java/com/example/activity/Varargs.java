package com.example.activity;

public class Varargs {

    static void  summa (String s,int...a){
        int summa = 0;
        for (int i = 0; i<a.length; i++){
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);

    }

    static void  summaMassiv (int[]a){
        int summa = 0;
        for (int i = 0; i<a.length; i++){
            summa += a[i];
        }
        System.out.println(summa);

    }

    public static void main(String...args){
        summa("Wow!!!!",6,6,6,9,0,2,13,67,90,1,-100);
        summaMassiv(new int[]{5,5});
        summa("Ok", new  int[]{1,1,1});
    }
}
