package factorymethoddesignpattern;

/**
 * Created by bhushan on 19/3/17.
 */
public class DebitCard implements Payment {
    @Override
    public void pay() {
        System.out.println("payment paid by debit card");
    }

    @Override
    public void refund() {
        System.out.println("payment refund by debit card");
    }
}
