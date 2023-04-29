package strategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Apple IPhone 14", 69000f);
        IWalletStrategy paymentMethod = new PhonePe();

        AmazonCart amazonCart = new AmazonCart(product, paymentMethod);
        amazonCart.pay();

    }
}
