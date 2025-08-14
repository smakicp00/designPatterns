package payment;

public class CreditCardStrategy implements PaymentStrategy{

    private String cardNumber;

    public CreditCardStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying with credit card " + amount);
    }
}
