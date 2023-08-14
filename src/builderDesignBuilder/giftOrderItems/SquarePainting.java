package builderDesignBuilder.giftOrderItems;

public class SquarePainting extends PaintingItem{
    @Override
    public void printPrice() {
        System.out.println("Painting price: $39");
    }

    @Override
    public void printType() {
        System.out.println("Painting type: Square");
    }
}
