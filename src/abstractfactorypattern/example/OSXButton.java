package abstractfactorypattern.example;

/**
 * Created by bhushan on 20/3/17.
 */
public class OSXButton implements IButton {
    @Override
    public void paint() {
        System.out.println("osx .....");
    }
}
