package builderDesignBuilder;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car.CarBuilder("Simple SteeringWheels", "ABS Brakes", "Convex mirrors")
//                .withAc("Non-AC")
//                .withMusicSystem("Sony Music System")
//                .withSeatCover("Leather Seat Cover")
//                .build();
//        System.out.println(car);

        Painting painting = new SquarePainting();
        painting.name();
        painting.price();

        Plant plant = new IndoorPlant();
        plant.name();
        plant.price();
    }
}
