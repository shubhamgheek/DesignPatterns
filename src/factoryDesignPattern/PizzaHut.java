package factoryDesignPattern;

public class PizzaHut implements IPizzaShop{
    @Override
    public void bakePizza() {
        System.out.println("Baking PizzaHut Pizza...");
    }

    @Override
    public void deliverPizza() {
        System.out.println("Delivering via third-party delivery agent...");
    }
}
