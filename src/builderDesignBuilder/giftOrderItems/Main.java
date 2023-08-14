package builderDesignBuilder.giftOrderItems;

public class Main {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder()
                .withPaintingItem(new CircularPainting())
                .withPlantItem(new IndoorPlant())
                .build();

        System.out.println(order);
    }
}
