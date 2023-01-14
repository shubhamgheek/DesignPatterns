package factoryMethodDesignPattern;

public class PlatinumCreditCardFactory extends CreditCardFactory{
    @Override
    protected ICreditCard createFactory() {
        return new PlatinumCreditCard();
    }
}
