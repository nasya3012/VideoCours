package Thread;

public class TreadTest {
    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        mt.start();
//
//        MyThread mt12 = new MyThread();
//        mt12.start();

        Thread thread = new Thread(() -> {
            for (int i = 0; i<=100; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello # " + i);
            }
        });
//        thread.setDaemon(true); //поток обрывается, когда заканчивает работу поток main
        thread.start();
    }
}


class MyThread extends Thread{
    public void run(){
        for (int i = 0; i<=100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello # " + i);
        }
    }
}
