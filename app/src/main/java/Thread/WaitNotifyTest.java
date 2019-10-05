package Thread;

import java.util.LinkedList;
import java.util.Queue;

public class WaitNotifyTest {


    public static void main(String[] args) throws InterruptedException {
        ProduserConsumer pk = new ProduserConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pk.produse();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pk.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class ProduserConsumer {

    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    Object lock = new Object();

    public void produse() throws InterruptedException {
        int value = 0;
        while (true){
            synchronized (lock){
                while (queue.size()==LIMIT) {
                    lock.wait();
                }
                    queue.offer(value++);
                lock.notify();

            }
        }

    }

    public void consumer() throws InterruptedException {

        while (true){
            synchronized (lock){
                while (queue.size()==0){
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println(" Queu =  " +queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}
