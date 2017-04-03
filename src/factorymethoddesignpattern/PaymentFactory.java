package factorymethoddesignpattern;

/**
 * Created by bhushan on 19/3/17.
 */
public class PaymentFactory {
    public static Payment getPayment(PaymentMethod paymentMethod) {
        switch (paymentMethod) {
            case CREDITCARD:
                return new CreditCard();
            case DEBITCARD:
                return new DebitCard();
        }
        return null;
    }
}
