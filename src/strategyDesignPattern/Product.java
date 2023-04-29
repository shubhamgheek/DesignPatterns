package strategyDesignPattern;

public class Product {
    private String productName;
    private Float productPrice;

    public Product(String productName, Float productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
