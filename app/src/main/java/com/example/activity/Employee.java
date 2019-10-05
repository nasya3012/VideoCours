package com.example.activity;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

//    Employee( String surname2, double salary2){
//        salary = salary2;
//        surname =  surname2;
//    }

   public Employee(int id1){
        id = id1;
    }

    Employee(String surname1){
        surname = surname1;
    }

    private Employee(double salary1){
        salary = salary1;
    }


    public void showId(){
        System.out.println(id);
    }
    public void showSurname(){
        System.out.println(surname);
    }
    public void showSalary(){
        System.out.println(salary);
    }


//
//    double yvelichenieSalary (){
//        salary *= 2;
//        return(salary);
//    }
}
//class EmployeeTest{
//
//    public static void main(String[] args){
////
//        Employee ivan = new Employee("Ivanov", 100.5);
//        Employee kolya = new Employee( "Petrov", 900.0);

//        ivan.yvelichenieSalary();
//        System.out.println(ivan.surname + ivan.salary);
//
//        kolya.yvelichenieSalary();

//    }
//}
