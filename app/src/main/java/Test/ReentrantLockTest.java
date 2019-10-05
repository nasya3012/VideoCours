package Test;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) throws InterruptedException{
        Task task = new Task();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.first();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.second();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCounter();
    }
}


class Task{

    private int counter;
    Lock lock = new ReentrantLock();

    public void increment(){
        for (int i = 0; i<1000; i++){
            counter++;
        }
    }

    public void first(){
        lock.lock();
        increment();
        lock.unlock();
    }
    public void second(){
        lock.lock();
        increment();
        lock.unlock();
    }

    public void showCounter(){
        System.out.println(counter);
    }
}