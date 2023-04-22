package factoryDesignPattern;

public class PizzaFactory {
    public static IPizzaShop getPizzaShop(String name){
        IPizzaShop pizzaShop = null;
        switch (name.toLowerCase()){
            case "dominos":
                pizzaShop = new Dominos();
                break;
            case "pizzahut":
                pizzaShop = new PizzaHut();
                break;
            default:
                System.out.println("Invalid pizza shop: "+name);
        }
        return pizzaShop;
    }
}
