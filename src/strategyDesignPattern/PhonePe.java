package strategyDesignPattern;

public class PhonePe implements IWalletStrategy{
    @Override
    public void pay(float amount) {
        System.out.println("Paying "+amount+" via PhonePe wallet");
    }
}
