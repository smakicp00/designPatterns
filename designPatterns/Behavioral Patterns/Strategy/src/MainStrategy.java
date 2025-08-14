import payment.CreditCardStrategy;
import payment.PayPalStrategy;
import payment.PaymentStrategy;
import payment.ShoppingCart;

public class MainStrategy {

    public static void testStrategy(){
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardStrategy("1234567890"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalStrategy("<EMAIL>"));
        cart.checkout(100);

    }

    public static void main(String[] args) {
        testStrategy();
    }
}
