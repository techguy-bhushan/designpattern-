package abstractfactorypattern.example;

/**
 * Created by bhushan on 20/3/17.
 */
public class WinButton implements IButton {
    @Override
    public void paint() {
        System.out.println("win .......");
    }
}
