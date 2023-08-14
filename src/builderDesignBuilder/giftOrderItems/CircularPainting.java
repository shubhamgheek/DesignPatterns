package builderDesignBuilder.giftOrderItems;

public class CircularPainting extends PaintingItem{
    @Override
    public void printPrice() {
        System.out.println("Painting price: $49");
    }

    @Override
    public void printType() {
        System.out.println("Painting type: Circular");
    }
}
