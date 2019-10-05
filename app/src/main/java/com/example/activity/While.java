package com.example.activity;

public class While {

    public  static void time(){
        int hour = 0;

        AUTER: while (hour < 6){

            int min = -1;

            INNER: do {

                min++;

                if (hour > 1 && min % 10 == 0){
                    break AUTER;
                }

                int sec = 0;

                ININNER: while  (sec < 60 ){

                    if (min < sec * hour){
                        continue INNER;
                    }
                    System.out.println(hour+" : "+ min +" : "+ sec);
                    sec++;
                }
            }
            while (min < 59);
            hour++;
        }

    }

    public static void main(String[] args){
        time();
    }
}
