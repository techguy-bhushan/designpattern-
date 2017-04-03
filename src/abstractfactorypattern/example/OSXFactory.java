package abstractfactorypattern.example;

/**
 * Created by bhushan on 20/3/17.
 */
public class OSXFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}
