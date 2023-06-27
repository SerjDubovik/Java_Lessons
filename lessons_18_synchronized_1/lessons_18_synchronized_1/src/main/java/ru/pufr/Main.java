package ru.pufr;

public class Main {

    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.doWork();
    }

    public synchronized void Increment(){
        counter++;
    }

    public  void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 10000; i++){
                    Increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 10000; i++){
                    Increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}