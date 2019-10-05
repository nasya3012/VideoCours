package Test;


public class Testing {

    public static void main(String[] args) {
        Human h1 = new Human("Kolya", 22);
        Human h3 = new Human("Olya", 6);
        Human h2 = new Human("Nadya", 16);
        Human h4 = new Human("Sasha", 33);
        Human h5 = new Human("Vlad", 72);
        h1.access();
        h2.access();
        h3.access();
        h4.access();
        h5.access();
    }
}

class Human {
    public String name;
   public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void access(){
        if (age < 18){
            System.out.println(name+ ", you access denied!!!");
        }else {
            System.out.println(name+ ", you are allowed access.");
        }

    }
}
