package builderDesignBuilder;

public class Order {

    // Mandatory Params
    private String name;
    private float price;

    // Optional Params
    private boolean isGiftPacked;

    public Order(OrderBuilder orderBuilder) {
        this.name = orderBuilder.name;
        this.price = orderBuilder.price;
        this.isGiftPacked = orderBuilder.isGiftPacked;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isGiftPacked=" + isGiftPacked +
                '}';
    }

    public static class OrderBuilder implements IOrder {

        // Mandatory Params
        private String name;
        private float price;

        // Optional Params
        private boolean isGiftPacked;

        public OrderBuilder(String name, float price) {
            this.name = name;
            this.price = price;
        }

        public OrderBuilder withGiftPacked(boolean isGiftPacked) {
            this.isGiftPacked = isGiftPacked;
            return this;
        }

        @Override
        public Order buildOrder() {
            return new Order(this);
        }
    }
}
