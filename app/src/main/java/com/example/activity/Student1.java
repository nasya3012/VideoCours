package com.example.activity;

public class Student1 {

    String name;
    int course;
    int assessment;

    Student1 (String name,int course, int assessment){
        this.name = name;
        this.course = course;
        this.assessment = assessment;
    }
}

class Student1Test{

    static void one (Student1 st1, Student1 st2){
        if (st1.name.equals(st2.name) && st1.course==st2.course && st1.assessment == st2.assessment)
            System.out.println("Студенты одинаковые");
        else
            System.out.println("Студенты разные");
    }

    static void two(Student1 st1, Student1 st2) {
        if (st1.name.equals(st2.name)){
            if(st1.course==st2.course){
                if (st1.assessment==st2.assessment){
                    System.out.println("Они одинаковы");
                } else {
                    System.out.println("Именя студентов и курсы одинаковые, но оценки различаются");
                }
            } else {
                System.out.println("Именя студентов одинаковы, но курсы различаются");
            }
        } else {
            System.out.println("Имена разные");
        }
    }

    public static void main(String[] args){

        Student1Test st = new Student1Test();
        Student1 st1 = new Student1("Lily", 6, 8);
        Student1 st2 = new Student1("Ololo", 2, 8);
        st.two(st1,st2);
        st.one(st1,st2);
    }
}