package com.example.activity;

public class MinMax {
    public  static  void minMax(double[] array){
        double max =  array[0];
        double min =  array[0];

        for (int i=1; i<array.length; i++){

            if (array[i]> max){
                max = array[i];
            }
            if (array[i]< min){
                min = array[i];
            }

        }
        System.out.println(min+"    "+max);
    }
}

class MinMaxTest{

    public static void main(String[] args){
//        double array[] = {10.5, 13.2, 9, -1.3, 0, 100};
//        MinMax.minMax(array);
//        MinMax.minMax(new double[]{1.5, 1, 6.4, 9.9});

        char array1 [] = {'P','r','i','v','e','t'};
        StringBuilder sb = new StringBuilder("Mama mia!!!");
//        sb.append(array1, 2,1);
        sb.insert(5, array1,0,3);
        System.out.println(sb);
    }
}