package com.example.activity;

public class Hour {

    public void time(){   //loops

        AUTER: for (int hour = 0; hour < 24; hour++){

            INNER: for (int min = 0; min <60; min++){
                if (min == 20){continue AUTER;}
                System.out.println(hour+" : "+ min);
                if (min == 30){ break AUTER;}
            }

        }
    }

    public static void main(String[] args){

        Hour h = new Hour();
        h.time();
    }
}
