package p1.p2.p3;

class Car {

    String color;
    double engine;
    int doors;

    Car(String color, double engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class  CarTest{

    static void swap(Car c1, Car c2){
        String c3 = c1.color;
        c1.color=c2.color;
        c2.color=c3;
    }

    int changeDoors (Car car, int doors){
        car.doors  = doors;
        return doors;
    }

    public static void main(String[] args) {

        Car car1 = new Car("red", 2.5, 2);
        Car car2 = new Car("yellow", 1.3, 5);
        CarTest car = new CarTest();

        System.out.println("Stalo " +  car.changeDoors(car1,10));

        swap(car1,car2);

        System.out.println(car1.color);
        System.out.println(car1.engine);
        System.out.println(car1.doors);

        System.out.println(car2.color);
        System.out.println(car2.engine);
        System.out.println(car2.doors);
    }
}