package observerDesignPattern.productNotification;

public interface ICustomer {
    void update(boolean isAvailable);

    String getCustomerName();
}
