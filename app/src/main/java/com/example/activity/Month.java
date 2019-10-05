package com.example.activity;

public class Month {

public static void month (int number){
    switch(number) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("В месяце 31 день");
            break;
        case 2:
            System.out.println("В месяце 28 дней");
            break;
        case  11:
        case 9:
        case 6:
        case 4:
            System.out.println("В месяце 30 дней");
            break;
        default:
            System.out.println("Такого месяца не существует");

    }}

    public static void main(String[] args){
      month(-5);
      month(2);
      month(3);
      month(0);
    }
}
