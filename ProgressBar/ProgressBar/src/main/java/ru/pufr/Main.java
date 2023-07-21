package ru.pufr;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    private static int count = 0;

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(20);

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Создаём потоки: ");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){

                    count++;

                    try {
                        queue.put(count);                   // делим полезную работу на этапы, каждый этап - запись в очередь
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        Thread.sleep(600);              // тут делаем что-то полезное
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                try {
                    queue.put(100);                       // флаг-команда, что шкала полная
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Прогрес выполнения: ");

                int i = 0;

                while (true) {

                    try {
                        i = queue.take();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.print(".");

                    if(i == 100){
                        System.out.println();
                        break;
                    }
                }

                System.out.println("Задачи выполнены: ");

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println();
        System.out.println("Количество отсчётов о очереди: " + count);
        System.out.println();
        System.out.println("Завершение.");
    }
}