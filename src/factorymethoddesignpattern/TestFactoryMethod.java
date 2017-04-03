package factorymethoddesignpattern;

/**
 * Created by bhushan on 19/3/17.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment(PaymentMethod.CREDITCARD);
        payment.pay();
        payment.refund();
        Payment payment1 = PaymentFactory.getPayment(PaymentMethod.DEBITCARD);
        payment1.pay();
        payment1.refund();
    }
}
