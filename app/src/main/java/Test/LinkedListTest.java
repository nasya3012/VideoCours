package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {

        MyLinkedList mls = new MyLinkedList();
        mls.add(1);
        mls.add(2);
        mls.add(3);
        System.out.println(mls);
        System.out.println(mls.get(0));
        System.out.println(mls.get(1));
        System.out.println(mls.get(2));
        mls.remove(1);
        System.out.println(mls);
        mls.remove(1);
        System.out.println(mls);


        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
//        timeAdd(linkedList);
//        timeAdd(arrayList);
//        timeGet(linkedList);
//        timeGet(arrayList);
//        timeGetAndAdd(linkedList);
//        timeGetAndAdd(arrayList);
//        timeAddInFerstPlase(linkedList);
//        timeAddInFerstPlase(arrayList);
    }
    private static void timeAdd (List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i= 0; i<1000000; i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    private static void timeGet (List<Integer> list){

        for (int i= 0; i<100000; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        for (int i= 0; i<100000; i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    private static void timeGetAndAdd (List<Integer> list){


        long start = System.currentTimeMillis();

        for (int i= 0; i<100000; i++){
            list.add(i);
        }

        for (int i= 0; i<100000; i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    private static void timeAddInFerstPlase (List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i= 0; i<1000; i++){
            list.add(0,i); //добавляем елемент на первое место
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

}
