package simpleFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ICreditCard creditCard = CreditCardFactory.getCreditCardDetails("Platinum");
        if(creditCard != null){
            System.out.println("Card Type: "+ creditCard.getCardType());
            System.out.println("Annual Fee: "+creditCard.getAnnualFee());
            System.out.println("Limits: "+creditCard.getCardLimits());
        }
    }
}
