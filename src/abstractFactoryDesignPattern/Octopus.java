package abstractFactoryDesignPattern;

public class Octopus implements IAnimal{
    @Override
    public String speak() {
        return "Silent";
    }

    @Override
    public String type() {
        return "Octopus";
    }
}
