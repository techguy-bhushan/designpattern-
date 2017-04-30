package adapter.example2;

/**
 * Created by bhushan on 30/4/17.
 */
public class InPlugConnector implements IInConnector {
    @Override
    public void provideSupply() {
        System.out.println("Supply InPlugConnector...............");
    }
}
