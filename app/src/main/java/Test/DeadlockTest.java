package Test;


import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockTest {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1 = new Thread(() -> runner.firstThread());
        Thread thread2 = new Thread(() -> runner.secondThread());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class Runner{
    Accaunt accaunt1 = new Accaunt();
    Accaunt accaunt2 = new Accaunt();

    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

    private void takeLocks (Lock lock1, Lock lock2){
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void firstThread(){
        Random random = new Random();
        for (int i = 0; i<10000; i++){
            takeLocks(lock1,lock2);
            try {
                Accaunt.transfer(accaunt1,accaunt2,random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread(){
        Random random = new Random();
        for (int i = 0; i<10000; i++){
           takeLocks(lock2,lock1);
            try {
                Accaunt.transfer(accaunt2,accaunt1,random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished(){
        System.out.println(accaunt1.getBalanse());
        System.out.println(accaunt2.getBalanse());
        System.out.println("All balanse " + (accaunt1.getBalanse() + accaunt2.getBalanse()));
    }
}

class Accaunt {
    private  int balanse = 10000;

    public void deposit(int amount){
        balanse += amount;
    }

    public void widthdrow (int amount){
        balanse -= amount;
    }

    public int getBalanse (){
        return balanse;
    }

    public static void transfer (Accaunt ak1, Accaunt ak2, int amount){
        ak1.widthdrow(amount);
        ak2.deposit(amount);

    }
}
