package abstractfactorypattern.example2;

/**
 * Created by bhushan on 20/3/17.
 */
public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
