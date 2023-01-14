package factoryMethodDesignPattern;

public class CoralCreditCardFactory extends CreditCardFactory{
    @Override
    protected ICreditCard createFactory() {
        return new CoralCreditCard();
    }
}
