package singletonDesignPattern.singletonDesignPatternWithLazyLoading;

import java.util.Objects;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(Objects.isNull(instance)){
            instance = new SingletonClass();
        }
        return instance;
    }

    public void printHello(){
        System.out.println("Hello");
    }
}
