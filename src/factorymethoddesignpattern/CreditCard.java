package factorymethoddesignpattern;

/**
 * Created by bhushan on 19/3/17.
 */
public class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("payment paid by credit card");
    }

    @Override
    public void refund() {
        System.out.println("payment refund by credit card");
    }
}
