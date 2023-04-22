package abstractFactoryDesignPattern;

public class Shark implements IAnimal {
    @Override
    public String speak() {
        return "Pau Pau";
    }

    @Override
    public String type() {
        return "Shark";
    }
}
