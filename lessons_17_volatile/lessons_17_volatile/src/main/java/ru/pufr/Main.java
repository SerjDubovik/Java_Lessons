package ru.pufr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyTheread myTheread = new MyTheread();
        myTheread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myTheread.shutdown();

    }
}

class MyTheread extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running){
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}