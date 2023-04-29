package decoratorDesignPattern;

public class LuxuryCarDecorator extends CarDecorator{
    public LuxuryCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("Including features of Luxury car...");
    }
}
