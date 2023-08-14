package abstractFactoryDesignPattern.edcOnboarding;

public abstract class EdcFactory {

    public abstract IEdcMachine getProduct();

    public static IEdcMachine getFactory(EdcVendor edcVendor) {
        if (edcVendor == EdcVendor.BIJLIPAY) {
            return new BijliPay();
        } else if (edcVendor == EdcVendor.INGENICO) {
            return new Ingenico();
        }
        return null;
    }
}
