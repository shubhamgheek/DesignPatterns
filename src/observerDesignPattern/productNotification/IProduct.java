package observerDesignPattern.productNotification;

public interface IProduct {

    boolean getAvailability();
    void setAvailability(boolean isAvailable);

    void subscribe(ICustomer customer);
    void unSubscribe(ICustomer customer);

    void notifyCustomers();
}
