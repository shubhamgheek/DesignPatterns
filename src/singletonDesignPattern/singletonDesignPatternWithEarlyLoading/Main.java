package singletonDesignPattern.singletonDesignPatternWithEarlyLoading;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        singletonClass.printHello();

        if(singletonClass == singletonClass1 && singletonClass1 == singletonClass2){
            System.out.println("Singleton DP");
        }else{
            System.out.println("Not Singleton DP");
        }
    }
}
