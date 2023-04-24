package builderDesignBuilder;

public class SquarePainting extends Painting{
    @Override
    public void name() {
        System.out.println("Square Painting");
    }

    @Override
    public void price() {
        System.out.println(1299);
    }
}
