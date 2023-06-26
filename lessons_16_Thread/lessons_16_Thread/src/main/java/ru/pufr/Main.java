package ru.pufr;

public class Main {
    public static void main(String[] args) {
        /*
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();
        */

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class MyThread extends Thread {
    public  void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("Hello from MyThread" + i);
        }
    }
}