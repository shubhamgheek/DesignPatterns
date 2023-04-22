package factoryDesignPattern;

public class Dominos implements IPizzaShop{
    @Override
    public void bakePizza() {
        System.out.println("Baking domino's Pizza...");
    }

    @Override
    public void deliverPizza() {
        System.out.println("Delivering via dominos delivery agent...");
    }
}
