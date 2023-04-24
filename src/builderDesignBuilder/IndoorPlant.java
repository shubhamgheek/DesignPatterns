package builderDesignBuilder;

public class IndoorPlant extends Plant{
    @Override
    public void name() {
        System.out.println("Indoor Plant");
    }

    @Override
    public void price() {
        System.out.println(499);
    }
}
