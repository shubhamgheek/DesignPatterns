package abstractFactoryDesignPattern.edcOnboarding;

public class Main {

    public static void main(String[] args) {
        IEdcMachine bijliPayEdc = EdcFactory.getFactory(EdcVendor.INGENICO);
        System.out.println(bijliPayEdc.getInfo());
    }
}
