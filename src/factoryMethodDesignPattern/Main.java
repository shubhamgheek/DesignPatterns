package factoryMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        String cardType = "Coral";

        ICreditCard creditCard = null;

        if(cardType.equals("Platinum")){
            creditCard = new PlatinumCreditCardFactory().createFactory();
        }else if(cardType.equals("Coral")){
            creditCard = new CoralCreditCardFactory().createFactory();
        }else{
            System.out.println("Invalid Card Type !");
        }

        if(creditCard != null){
            System.out.println("Card Type: "+ creditCard.getCardType());
            System.out.println("Annual Fee: "+creditCard.getAnnualFee());
            System.out.println("Limits: "+creditCard.getCardLimits());
        }
    }
}
