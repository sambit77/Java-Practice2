package core;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class PrintJob implements Runnable
{

    @Override
    public void run() {
        System.out.println("Hello from thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ExecutorService {

    public static void main(String[] args) throws Exception{

        Runnable r1 = new PrintJob();
        Runnable r2 = new PrintJob();
        Runnable r3 = new PrintJob();
        Runnable r4 = new PrintJob();
        Runnable r5 = new PrintJob();
        Runnable r6 = new PrintJob();

        java.util.concurrent.ExecutorService pool =  Executors.newFixedThreadPool(2);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);

        pool.shutdown();


    }
}
