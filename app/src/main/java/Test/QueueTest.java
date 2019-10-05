package Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {

        Personss p1 = new Personss(1);
        Personss p2 = new Personss(2);
        Personss p3 = new Personss(3);
        Personss p4 = new Personss(4);

        Queue<Personss> list = new ArrayBlockingQueue<Personss>(10) ;
        list.add(p3);
        list.add(p1);
        list.add(p4);
        list.add(p2);

        for (Personss p: list) {
            System.out.println(p);
        }
        System.out.println();


        System.out.println(list.remove());
        System.out.println();

        for (Personss p: list) {
            System.out.println(p);
        }

        System.out.println();


        System.out.println(list.peek());
        System.out.println();

        for (Personss p: list) {
            System.out.println(p);
        }
    }
}

class  Personss {
    private  int id;

    public Personss(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Personss{" +
                "id=" + id +
                '}';
    }
}