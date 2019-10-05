package com.example.activity.p4.p5;

public class Student {

    private StringBuffer name = new StringBuffer();
    public StringBuffer getName (){
        StringBuffer name1 = new StringBuffer(name);
        return name1;
    }
    public void setName (StringBuffer s){
        if (s.length()>3){
            name=s;
        }
    }


    private int course;
    public int getCourse(){
        return course;
    }
    public void setCourse(int c){
        if(c>1 && c<4){
            course =c;
        }
    }


    private int grade;
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        if (grade>=1 && grade<=10){
            this.grade =  grade;
        }
    }

    public void showInfo (){
        System.out.print("Name " +getName()+" Course "+ getCourse()+ " Grade " + getGrade());
    }
}

class StudentTest extends Student{
    public static void main(String[] args){
        StudentTest st = new StudentTest();
        StringBuffer n = new StringBuffer("Nana");
        st.setName(n);
        st.setCourse(3);
        st.setGrade(7);

        st.showInfo();
    }

}