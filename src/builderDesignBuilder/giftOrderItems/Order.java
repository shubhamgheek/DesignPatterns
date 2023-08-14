package builderDesignBuilder.giftOrderItems;

public class Order {
    private PlantItem plantItem;
    private PaintingItem paintingItem;

    public Order(OrderBuilder orderBuilder){
        this.paintingItem = orderBuilder.paintingItem;
        this.plantItem = orderBuilder.plantItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "plantItem=" + plantItem +
                ", paintingItem=" + paintingItem +
                '}';
    }

    public static class OrderBuilder{
        private PlantItem plantItem;
        private PaintingItem paintingItem;

        public OrderBuilder withPlantItem(PlantItem plantItem){
            this.plantItem = plantItem;
            return this;
        }

        public OrderBuilder withPaintingItem(PaintingItem paintingItem){
            this.paintingItem = paintingItem;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}
