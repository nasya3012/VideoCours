package com.example.activity;


public class Array {

    static public String[] abc (String[]...array){
        int length = 0;

        for (String[] array1 : array){
            length += array1.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] array1 : array) {
            for (String s : array1) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }


    public static void main(String[] args) {
        String [] target = abc(new String[]{"hj","jj","jj"}, new String[]{"hj","oo","jj"});
        for (String s : args){
            for (int i =0; i<target.length; i++){
                if (s.equals(target[i])){
                    target[i] = null;
                }
            }
        }
        for (String s : target){
            System.out.println(s + " ");
        }
        System.out.println();
    }
}
