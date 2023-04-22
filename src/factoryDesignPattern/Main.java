package factoryDesignPattern;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        IPizzaShop pizzaShop = PizzaFactory.getPizzaShop("dominos");
        if(Objects.nonNull(pizzaShop)){
            pizzaShop.bakePizza();
            pizzaShop.deliverPizza();
        }
    }
}
