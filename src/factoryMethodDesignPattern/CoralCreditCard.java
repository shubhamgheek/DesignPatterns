package factoryMethodDesignPattern;

public class CoralCreditCard implements ICreditCard {

    @Override
    public String getCardType() {
        return "Coral Credit Card";
    }

    @Override
    public int getAnnualFee() {
        return 500;
    }

    @Override
    public int getCardLimits() {
        return 500000;
    }
}
