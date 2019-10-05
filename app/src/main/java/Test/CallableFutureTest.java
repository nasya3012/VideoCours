package Test;


import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureTest {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(1);

        Future<Integer> future = ex.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Start");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("End");
                Random random = new Random();
                int randomValue = random.nextInt();
                if (randomValue < 5)
                    throw new Exception("Bad kod");
                return random.nextInt(10);
            }
        });
        ex.shutdown();

        try {
            int result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable tr = e.getCause();
            System.out.println(tr.getMessage());
        }

    }
}
