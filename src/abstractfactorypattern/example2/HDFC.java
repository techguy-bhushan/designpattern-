package abstractfactorypattern.example2;

/**
 * Created by bhushan on 20/3/17.
 */
public class HDFC implements Bank {
    private static final String BANK_NAME = "HDFC";
    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}
