package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Synchronized2Test {

    public static void main(String[] args) throws InterruptedException {
        new Worked().main();
    }

}

class Worked {

    Object lock1 = new Object();
    Object lock2 = new Object();

    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public  void addList (List list, Object ob){
        synchronized(ob){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(random.nextInt(1000));
        }
    }


    public void work(){
        for (int i =0; i<1000; i++){
            addList(list1,lock1);
            addList(list2,lock2);
        }
    }


    public void main(){
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println(after-before);
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
