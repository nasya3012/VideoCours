package com.example.activity;

public class Student {

    Student(int id1, String name1, String surname1, int course1, double assessmentPhysics1, double historyScore1, double mathGrade1){
        id = id1;
        name =name1;
        surname = surname1;
        course = course1;
        assessmentPhysics =  assessmentPhysics1;
        historyScore = historyScore1;
        mathGrade = mathGrade1;
    }

    Student(int id2, String name2, String surname2, int course2){
        this(id2,name2,surname2,course2, 0,0,0);
    }

    Student(){
    }

    int id;
    String name;
    String surname;
    int course;
    double assessmentPhysics;
    double historyScore;
    double mathGrade;

//    double sredneeArifmeticheskoe (double mathGrade, double assessmentPhysics, double historyScore){
//        double resalt = (mathGrade + assessmentPhysics + historyScore) / 3;
//        return resalt;
//    }
}

class StudentTest {

    public static void main(String[] args){

        Student st1 = new Student();
        st1.id = 1;
        st1.name = "Katya";
        st1.surname = "Polakova";
        st1.course = 1;
        st1.assessmentPhysics = 10;
        st1.historyScore = 10;
        st1.mathGrade = 10;

        Student st2 = new Student(2,"Sasha","Li",2);
        st2.assessmentPhysics = 5;
        st2.historyScore = 5;
        st2.mathGrade = 5;

        Student st3 = new Student(3, "Den", "Bi",3,1,1,1);

        StudentTest test = new StudentTest();
        test.srAr(st1);
        test.srAr(st2);
        test.srAr(st3);

//        Student i = new Student();
//        Student denis = new Student();
//        Student sasha = new Student();
//
//        i.name = "Evgenia";
//        i.assessmentPhysics = 10.5;
//        i.historyScore = 11;
//        i.mathGrade= 10;
//
//        denis.name = "denis";
//        denis.assessmentPhysics = 6;
//        denis.historyScore = 10;
//        denis.mathGrade = 5;
//
//        sasha.name = "sasha";
//        sasha.assessmentPhysics = 12;
//        sasha.historyScore = 10;
//        sasha.mathGrade = 11;
//
//
//        StudentTest sTest = new StudentTest();
//        sTest.srAr(i);
//        sTest.srAr(denis);
//        sTest.srAr(sasha);
//
//        System.out.println( i.name + ": средняя оценка " + (i.sredneeArifmeticheskoe(i.assessmentPhysics, i.historyScore, i.mathGrade)));
//        System.out.println( denis.name + ": средняя оценка " + (denis.sredneeArifmeticheskoe(denis.assessmentPhysics, denis.historyScore, denis.mathGrade)));
//        System.out.println( sasha.name + ": средняя оценка " +(sasha.sredneeArifmeticheskoe(sasha.assessmentPhysics, sasha.historyScore, sasha.mathGrade)));
    }

    double srAr (Student st){
        double srednOc = ((st.assessmentPhysics + st.historyScore + st.mathGrade)/3);
        System.out.println("srednya ocenka" + st.name + srednOc);
        return  srednOc;
    }

}


