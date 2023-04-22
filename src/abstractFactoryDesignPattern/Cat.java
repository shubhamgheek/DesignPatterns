package abstractFactoryDesignPattern;

public class Cat implements IAnimal{
    @Override
    public String speak() {
        return "Meow meow";
    }

    @Override
    public String type() {
        return "Cat";
    }
}
