package payment;

public class PayPalStrategy implements PaymentStrategy{

    private String email;

    public PayPalStrategy(String email){
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying with PayPal " + amount);
    }

}
