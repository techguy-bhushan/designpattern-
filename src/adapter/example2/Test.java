package adapter.example2;

/**
 * Created by bhushan on 30/4/17.
 */
public class Test {
    public static void main(String[] args) {
        InSocket inSocket = new InSocket();
        IInConnector iInConnector = new UsToInConnectorAdapter(new InPlugConnector());
        inSocket.pluginInSocket(iInConnector);
    }
}
