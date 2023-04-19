package singletonDesignPattern.singletonDesignPatternWithEnum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void task1(String message) {
        SingletonClass singletonClass = SingletonClass.Instance;
        singletonClass.printMessage(message);
    }

    public static void task2(String message) {
        SingletonClass singletonClass = SingletonClass.Instance;
        singletonClass.printMessage(message);
    }

    public static void task3(String message) {
        SingletonClass singletonClass = SingletonClass.Instance;
        singletonClass.printMessage(message);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> task1("Hello"));
        executorService.submit(() -> task2("Hello"));
        executorService.submit(() -> task3("Hello"));

        executorService.shutdown();
    }
}
