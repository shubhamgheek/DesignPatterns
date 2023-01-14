package simpleFactoryDesignPattern;

public class PlatinumCreditCard implements ICreditCard{

    @Override
    public String getCardType() {
        return "Platinum";
    }

    @Override
    public int getAnnualFee() {
        return 100;
    }

    @Override
    public int getCardLimits() {
        return 10000;
    }
}
