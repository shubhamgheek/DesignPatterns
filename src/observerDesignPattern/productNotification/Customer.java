package observerDesignPattern.productNotification;

public class Customer implements ICustomer{

    private String customerName;

    public Customer(String customerName){
        this.customerName =customerName;
    }

    @Override
    public void update(boolean isAvailable) {
        System.out.println("Hello "+customerName+", product is now available: "+isAvailable);
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }
}
