package builderDesignBuilder;

public class NewMain {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder("iPhone", 82000f)
                .withGiftPacked(true)
                .buildOrder();

        System.out.println(order);
    }
}
