package singletonDesignPattern.singletonDesignPatternWithEnum;

public enum SingletonClass {

    Instance;

    SingletonClass(){
        System.out.println("Private default constructor...");
    }

    public void printMessage(String message){
        System.out.println("Message: "+message);
    }
}
