package adapter.example2;

/**
 * Created by bhushan on 30/4/17.
 */
public class UsToInConnectorAdapter implements IInConnector {
    private InPlugConnector inPlugConnector;
    public  UsToInConnectorAdapter(InPlugConnector inPlugConnector) {
        this.inPlugConnector = inPlugConnector;
    }
    @Override
    public void provideSupply() {
        inPlugConnector.provideSupply();
    }
}
