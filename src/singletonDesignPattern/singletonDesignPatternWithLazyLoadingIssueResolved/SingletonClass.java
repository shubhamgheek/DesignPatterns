package singletonDesignPattern.singletonDesignPatternWithLazyLoadingIssueResolved;

import java.util.Objects;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass(){
        System.out.println("SingletonClass default private constructor ...");
    }

    public static synchronized SingletonClass getInstance(){
        if(Objects.isNull(instance)){
            instance = new SingletonClass();
        }
        return instance;
    }

//    public static SingletonClass getInstance1(){
//        synchronized (SingletonClass.class) {
//            if (Objects.isNull(instance)) {
//                instance = new SingletonClass();
//            }
//        }
//        return instance;
//    }

    public void printMessage(String message){
        System.out.println("Message: "+message);
    }
}
