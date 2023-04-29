package decoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
//        ICar luxuryCar = new LuxuryCarDecorator(new BasicCar());
//        luxuryCar.manufactureCar();

        ICar luxurySportsCar = new SportsCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        luxurySportsCar.manufactureCar();
    }
}
