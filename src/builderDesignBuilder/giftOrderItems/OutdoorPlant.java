package builderDesignBuilder.giftOrderItems;

public class OutdoorPlant extends PlantItem{
    @Override
    public void printPrice() {
        System.out.println("Plant price: $199");
    }

    @Override
    public void printType() {
        System.out.println("Plant type: Outdoor plant");
    }
}
