package com.example.activity.p4.p5;

public class Animal {

    Animal(){
        System.out.println("I am animal!!!");
    }

    int eyes;

    public void eats(){
        System.out.println("Animal eats");
    }

    public void drink(){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{

    Pet() {
        super();
        eyes= 2;
        System.out.println("I am pat!!!");
    }
    String name;
    int tail = 1;
    int paw = 4;


    public void run(){
        System.out.println("Pat runs");
    }

    public void jump(){
        System.out.println("Pat jumps");
    }

}

class Dog extends Pet{

Dog(String name){
    System.out.println("I am dog and my name is: "+ name);
}

    public void play(){
        System.out.println("Dog plays");
    }

}

class Cat extends Pet{

Cat(String name){
    System.out.println("I am cat and my name is: "+ name);
}

    public void sleep(){
        System.out.println("Cat sleeps");
    }

}
class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        System.out.println(dog.paw);

        Cat cat = new Cat("Cat");
        cat.sleep();
    }
}