package observerDesignPattern.productNotification;

public class Main {
    public static void main(String[] args) {
        ICustomer shubham = new Customer("Shubham");

        IProduct iPhone = new Product("Apple iPhone 14", false);
        iPhone.subscribe(shubham);

        iPhone.setAvailability(true);
        iPhone.notifyCustomers();
    }
}
