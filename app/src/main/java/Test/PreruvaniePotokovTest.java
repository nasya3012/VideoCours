package Test;


import java.util.Random;

public class PreruvaniePotokovTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i< 1_000_000_000; i++){
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("Thread breack");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Start");
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        thread.join();
        System.out.println("End");
    }
}
