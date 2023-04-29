package decoratorDesignPattern;

public class ElectricCarDecorator extends CarDecorator{

    public ElectricCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar(){
        super.manufactureCar();
        System.out.println("Including features of Electrical car...");
    }
}
