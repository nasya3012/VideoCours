package com.example.activity;
import java.util.*;

public class ArrayListt {

    public ArrayList<String> abc (String...s){

        ArrayList<String> sal = new ArrayList<>();

        for (String s1: s) {
            if (!sal.contains(s1)){//есть ли повторяющиеся строчки проверка
                sal.add(s1);
            }
        }
        Collections.sort(sal);
        System.out.println(sal);
        return sal;
    }

    int abc2 (int i){

        if (i<5){return 5;}
        else {return 10;}
    }

    public static void main(String[] args) {
        ArrayListt ob = new ArrayListt();
        ob.abc("anton", "katya", "bogdan", "ulya", "kostya", "ira", "tonya", "zina", "kostya");
        System.out.println();
        ob.abc("Ира","Таня","Женя","Яна","Аня","Аня");
        System.out.println();

        int a = 7;
        System.out.println(a<4? 7: "privet");

        int b = 4;
        int c = a<6? a++ : b++;
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        System.out.println(ob.abc2(7));
    }
}
