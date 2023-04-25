package chainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {

        MaangGroup maangGroupJob = new MaangGroup();
        ProductBased productBasedJob = new ProductBased();
        ServiceBased serviceBased = new ServiceBased();

        maangGroupJob.setNextJob(productBasedJob);
        productBasedJob.setNextJob(serviceBased);

        Person person = new Person("");
        maangGroupJob.getJob(person);
    }
}
