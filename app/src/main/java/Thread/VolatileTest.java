package Thread;

import java.util.Scanner;

public class VolatileTest {
    public static void main(String[] args) {
        X thread = new X();
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdovn();
    }
}


class  X extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void shutdovn(){
        this.running = false;
    }
}
