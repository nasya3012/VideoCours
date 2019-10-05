package com.example.activity;

public class Time {

    public  static void time(){

        AUTER: for (int hour = 0; hour < 6; hour++){

            INNER: for (int min = 0; min < 60; min++){

                if (hour > 1 && min % 10 == 0){
                    break AUTER;
                }

                ININNER: for (int sec = 0; sec < 60; sec++){

                    if (min < sec * hour){
                        continue INNER;
                    }
                    System.out.println(hour+" : "+ min +" : "+ sec);
                }
            }

        }

    }

    public static void main(String[] args){
        time();
    }
}
