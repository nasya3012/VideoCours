package com.example.activity;

public class Email {

    String list;

    public  static void mail (String list){

        int a= 0;
        int b = 0;
        int c = 0;

        while (c < list.length() - 1){

            a = list.indexOf('@',c);
            b = list.indexOf('.' , c);
            c = list.indexOf(';' , c+1);
            System.out.println(list.substring(a +1 , b));
        }
    }
}


class EmailTest{
    public static void main(String[] args){
        Email.mail("ya@yahoo.com; on@mail.ru; ona@gmail.com; oni@yandex.ru;");
    }
}