package com.example.activity;

import java.util.Arrays;

public class Sortirovka {

    static public int[] sortirovka (int[] array){

        int a;

        for (int i = 0; i< array.length; i++) {
            int min = array[i];
            int index = i;

            for (int j = i+1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args){
        int array[]= {2,3,8,1,-1,-5,10} ;
        sortirovka(array);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

      Arrays.sort(array);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        for (int a:array) {
            System.out.print(a+ "  ");
        }
    }
}
