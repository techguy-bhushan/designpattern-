package adapter.example2;

/**
 * Created by bhushan on 30/4/17.
 */
public class USPlugConnector implements IUSConnector {
    @Override
    public void supply() {
        System.out.println("supply USPlugConnector ..........");
    }
}
