package abstractFactoryDesignPattern.edcOnboarding;

public class BijliPayFactory extends EdcFactory{

    @Override
    public IEdcMachine getProduct() {
        return new BijliPay();
    }
}
