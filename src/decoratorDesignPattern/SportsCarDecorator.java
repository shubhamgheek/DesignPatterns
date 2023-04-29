package decoratorDesignPattern;

public class SportsCarDecorator extends CarDecorator{

    public SportsCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("Including features of Sports car...");
    }
}
