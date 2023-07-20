package ru.pufr;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int rnd = random.nextInt(100);

                if(rnd < 50) {
                    return  rnd;
                } else {
                    throw new Exception("random number over fifty");
                }


            }
        });

        executorService.shutdown();

        try {
            System.out.println("Value: " + future.get());           // дожидается окончания потока
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }

    }
}