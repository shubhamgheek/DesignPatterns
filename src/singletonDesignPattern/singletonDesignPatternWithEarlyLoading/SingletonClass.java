package singletonDesignPattern.singletonDesignPatternWithEarlyLoading;

public class SingletonClass {
    private static final SingletonClass instance;

    static {
        instance = new SingletonClass();
    }

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return instance;
    }

    public void printHello(){
        System.out.println("Hello");
    }
}
