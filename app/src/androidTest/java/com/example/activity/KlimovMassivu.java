package com.example.activity;
import java.util.Arrays;

public class KlimovMassivu {

     static int[] concatArray(int[] a, int[] b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        int[] r = new int[a.length + b.length];
        System.arraycopy(a,0,r,0,a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }

     static String[] concatArray(String[] a, String[] b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        String[] r = new String[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }

    public static void main(String[] args){// соеденяем 2 масива
        int[] a = {1,2,3,4};
        int[] b = {1,1,1,1};
        int [] r = concatArray(a,b);
        for (int s : r){
            System.out.print(s + " ");
        }
        System.out.println();

        String[] week1 = new String[] { "Понедельник", "Вторник", "Среда" };

        String[] week2 = new String[] { "Четверг", "Пятница", "Суббота",
                "Воскресенье" };

        String[] week = concatArray(week1, week2);

        for (String s : week){
            System.out.print(s+ " ");
        }

        System.out.println();

        int[] mice = new int[]{4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19};// меняются местами ервые и последние

        int arrayLenght = mice.length;

        for (int i = 0; i < arrayLenght / 2; i++) {
            int temp = mice[i];
            mice[i] = mice[arrayLenght - 1 - i];
            mice[arrayLenght - i - 1] = temp;
        }
        for (int s : mice){
            System.out.print(s+ " ");
        }

        System.out.println();// убираем 0-ли в конец

        int[] inputArray = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        int currentIndex = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0) {
                inputArray[currentIndex] = inputArray[i];
                currentIndex++;
            }
        }

        while (currentIndex < inputArray.length) {
            inputArray[currentIndex] = 0;
            currentIndex++;
        }
        System.out.println(Arrays.toString(inputArray));


        System.out.println();  //нули в начало!!!!Очень прикольный метод

        int[] inpArray = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        int curIndex = inpArray.length - 1;

        for (int i = inpArray.length - 1; i >= 0; i--) {
            if (inpArray[i] != 0) {
                inpArray[curIndex] = inpArray[i];
                curIndex--;
            }
        }

        while (curIndex >= 0) {
            inpArray[curIndex] = 0;
            curIndex--;
        }
        System.out.println(Arrays.toString(inpArray));
    }
}
