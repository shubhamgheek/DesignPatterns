package simpleFactoryDesignPattern;

public class CreditCardFactory {

    public static ICreditCard getCreditCardDetails(String cardType){
        ICreditCard creditCard = null;
        switch (cardType){
            case "Platinum":
                creditCard = new PlatinumCreditCard();
                break;
            case "Coral":
                creditCard = new CoralCreditCard();
                break;
            default:
                System.out.println("Invalid Card Type !");
        }
        return creditCard;
    }
}
