package com.example.activity;

public class Test {

    public static void main(String[] args) {
        Employee a = new Employee(2);
        Employee a1 = new Employee("R");
//        Employee a2 = new Employee(0.0);

        System.out.println(a.id);
        System.out.println(a.surname);
//        System.out.println(a.salary);

        System.out.println(a1.id);
        System.out.println(a1.surname);
//        System.out.println(a1.salary);
//
//        System.out.println(a2.id);
//        System.out.println(a2.surname);
//        System.out.println(a2.salary);

        a.showId();
        a.showSurname();
        a.showSalary();

        a1.showId();
        a1.showSurname();
        a1.showSalary();

//        a2.showId();
//        a2.showSurname();
//        a2.showSalary();


    }
}
