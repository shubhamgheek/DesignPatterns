package strategyDesignPattern;

public class GooglePay implements IWalletStrategy{
    @Override
    public void pay(float amount) {
        System.out.println("Paying "+amount+" via Google Pay wallet");
    }
}
