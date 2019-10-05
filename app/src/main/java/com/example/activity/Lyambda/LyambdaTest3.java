package com.example.activity.Lyambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LyambdaTest3 {
    public static void main(String[] args) {
        int [] array = new  int [10];
        List <Integer> list= new ArrayList<>();

        fillArray(array);
        fillList(list);

        array = Arrays.stream(array).map(a-> a*2).toArray();
        list = list.stream().map(a-> a*2).collect(Collectors.toList());

        System.out.println(Arrays.toString(array));
        System.out.println(list);

        array =Arrays.stream(array).filter(a-> a%3 == 0).toArray();
        list = list.stream().filter(a-> a%3 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(array));
        System.out.println(list);

        Arrays.stream(array).forEach(System.out::println);
        list.stream().forEach(System.out::println);

        int summ =  Arrays.stream(array).reduce(10,(acc, b) -> acc + b);
        int product = list.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(summ);
        System.out.println(product);

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(5);
        set = set.stream().map(a-> a*2).collect(Collectors.toSet());
        System.out.println(set);

    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i<10; i++)
            list.add(i+1);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i<10; i++)
            array[i] = i+1;
    }
}

