package builderDesignBuilder;

public class OutdoorPlant extends Plant{
    @Override
    public void name() {
        System.out.println("Outdoor Plant");
    }

    @Override
    public void price() {
        System.out.println(399);
    }
}
