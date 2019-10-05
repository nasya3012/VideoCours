package com.example.activity.Lyambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lyambda {
    String name;
    String department;
    double salary;

    Lyambda(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee{
    void printEmploee(Lyambda e){
        System.out.println("Имя "+ e.name + ",   департамент "+ e.department + ",    зарплата "+ e.salary);
    }

    void filtraciyaEmployee(ArrayList<Lyambda> e, Predicate<Lyambda> p){
        for (Lyambda s: e){
            if(p.test(s)){
                printEmploee(s);
            }

        }
    }
}

class Test2Employee{
    public static void main(String[] args) {
        ArrayList<Lyambda> list = new ArrayList<>();
        Lyambda st1 = new Lyambda("Ulya", "IT", 300.00);
        Lyambda st2 = new Lyambda("Egor", "HH", 450.00);
        Lyambda st3 = new Lyambda("Evgenia", "Sails", 100000.00);
        Lyambda st4 = new Lyambda("ZOO", "ZOO", 200.00);
        Lyambda st5 = new Lyambda("Allya", "IT", 500.00);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        TestEmployee t = new TestEmployee();

        t.filtraciyaEmployee(list, e -> e.salary > 200 && e.department =="IT");
        System.out.println("________________________________________________________");
        t.filtraciyaEmployee(list, e -> e.salary != 450 && e.name.startsWith("E"));
        System.out.println("________________________________________________________");
        t.filtraciyaEmployee(list, e -> e.name.equals(e.department));
//        list.removeIf(x->x.department=="IT"); Удаление из листа


    }
}