package com.example.activity;

abstract public class Animal2 {
    Animal2(String name){this.name= name;}
    String name;

    abstract void eat();
    abstract  void sleep();
}

abstract class Fish extends Animal2{
    Fish( String name){
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("It is always interesting to watch the fish sleep");
    }

    abstract void swim();
}

abstract class Birth extends Animal2 implements Speakable{
    Birth(String name){
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name +"  sings");
    }
}

abstract class Mammal extends Animal2 implements Speakable{
    Mammal(String name){
        super(name);
        this.name = name;
    }

    abstract void run();

    @Override
    public void speak() {
        System.out.println("Somebody speaks");
    }
}

interface Speakable{
    void speak();
}

class Swordsman extends Fish{
    Swordsman(String name){
        super(name);
        this.name = name;
        System.out.println(name);
    }

    @Override
    void eat() {
        System.out.println("Swordsman is not a predatory fish, she eats regular food");
    }

    @Override
    void swim() {
        System.out.println("Swordsman beautiful fish");
    }

}

class Penguin extends Birth {
    Penguin(String name){
        super(name);
        this.name = name;
        System.out.println(name);
    }

    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }

    @Override
    void eat() {
        System.out.println("Penguin like eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Penguin like eat sleep");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Penguin didn't speak");
    }
}

class Lion extends Mammal{
    Lion(String name){
        super(name);
        this.name = name;
        System.out.println(name);
    }

    @Override
    void eat() {
        System.out.println("Lion eat meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion like speak");
    }

    @Override
    void run() {
        System.out.println("Lion  speak");
    }
}

class Test1{
    public static void main(String[] args) {
        Swordsman sw = new Swordsman("Swordsman");
        sw.eat();
        sw.swim();
        sw.sleep();

        Speakable pe = new Penguin("Penguin");
        pe.speak();

        Animal2 l = new Lion("Lion");
        l.eat();
        l.sleep();

        Mammal l1 = new Lion("Lion 2");
        l1.run();
        l1.speak();
        l1.eat();
        l1.sleep();
    }

}