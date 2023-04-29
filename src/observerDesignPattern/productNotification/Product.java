package observerDesignPattern.productNotification;

import java.util.ArrayList;
import java.util.List;

public class Product implements IProduct{

    private List<ICustomer> customerList;
    private String productName;
    private boolean isAvailable;

    public Product(String productName, boolean isAvailable){
        this.productName = productName;
        this.isAvailable = isAvailable;
        this.customerList = new ArrayList<>();
    }

    public boolean getAvailability(){
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void subscribe(ICustomer customer){
        System.out.println(customer.getCustomerName()+" subscribed "+this.productName);
        customerList.add(customer);
    }

    public void unSubscribe(ICustomer customer){
        System.out.println(customer.getCustomerName()+" unSubscribed "+this.productName);
        customerList.remove(customer);
    }

    @Override
    public void notifyCustomers() {
        if(isAvailable) {
            for (ICustomer customer : customerList) {
                customer.update(true);
            }
        }
    }

}
