package builderDesignBuilder;

public class Car {
    // Mandatory params
    private String steeringWheels;
    private String brakeSystem;
    private String mirror;

    // Optional params
    private String ac;
    private String seatCover;
    private String musicSystem;

    public Car(CarBuilder builder) {
        this.steeringWheels = builder.steeringWheels;
        this.brakeSystem = builder.brakeSystem;
        this.mirror = builder.mirror;
        this.ac = builder.ac;
        this.seatCover = builder.seatCover;
        this.musicSystem = builder.musicSystem;
    }

    @Override
    public String toString() {
        return "Car = [ steeringWheels: " + steeringWheels + "\n" +
                " brakeSystem : " + brakeSystem + "\n" +
                " mirror : " + mirror + "\n" +
                " ac : " + ac + "\n" +
                " seatCover : " + seatCover + "\n" +
                " musicSystem : " + musicSystem + " ]";
    }

    public static class CarBuilder {
        // Mandatory params
        private String steeringWheels;
        private String brakeSystem;
        private String mirror;

        // Optional params
        private String ac;
        private String seatCover;
        private String musicSystem;

        public CarBuilder(String steeringWheels, String brakeSystem, String mirror) {
            this.steeringWheels = steeringWheels;
            this.brakeSystem = brakeSystem;
            this.mirror = mirror;
        }

        public CarBuilder withAc(String ac) {
            this.ac = ac;
            return this;
        }

        public CarBuilder withSeatCover(String seatCover) {
            this.seatCover = seatCover;
            return this;
        }

        public CarBuilder withMusicSystem(String musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
