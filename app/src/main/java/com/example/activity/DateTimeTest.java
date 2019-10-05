package com.example.activity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

    DateTimeFormatter f1 =  DateTimeFormatter.ofPattern("yyyy, MMMM - dd !! hh : mm");
    DateTimeFormatter f2 =  DateTimeFormatter.ofPattern("hh : mm, dd/MMM/yy");

    public void smena (LocalDateTime start, LocalDateTime end, Period p, Duration d){
        LocalDateTime ldt = start;
        while (ldt.isBefore(end)) {
            System.out.print(" Работаем с: " + ldt.format(f1));
            ldt = ldt.plus(p);
            System.out.println("     До:  " + ldt.format(f1));
            System.out.print(" Отдыхаем с  :" + ldt.format(f2));
            ldt = ldt.plus(d);
            System.out.println("    До:  " + ldt.format(f2));
            System.out.println("");
        }
    }
}

class TestDate{
    public static void main(String[] args) {
        LocalDateTime l1 = LocalDateTime.of(2016,01,01,9,0,0);
        LocalDateTime l2 = LocalDateTime.of(2016,10,31,18,0,0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);
        DateTimeTest time =  new DateTimeTest();
        time.smena(l1,l2,p,d);
    }
}

