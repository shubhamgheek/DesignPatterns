package builderDesignBuilder.giftOrderItems;

public class IndoorPlant extends PlantItem {

    @Override
    public void printPrice() {
        System.out.println("Plant price: $99");
    }

    @Override
    public void printType() {
        System.out.println("Plant type: Indoor plant");
    }
}
