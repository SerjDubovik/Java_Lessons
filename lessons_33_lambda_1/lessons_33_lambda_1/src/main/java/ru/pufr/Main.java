package ru.pufr;

interface Executable {
    void execute();

}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImplementation implements  Executable {

    @Override
    public void execute() {
        System.out.println("Hello 1");
    }
}

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {

            @Override
            public void execute() {
                System.out.println("Hello 2");
            }
        });

        runner.run(() -> System.out.println("Hello 3"));
    }
}