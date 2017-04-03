package abstractfactorypattern.example;

import java.util.Random;

/**
 * Created by bhushan on 20/3/17.
 */
public class Test {
    public static void main(String[] args) {
        IGUIFactory iguiFactory = null;
        String appearance = randomAppearance();
        if (appearance.equals("osx")) {
            iguiFactory = new OSXFactory();
        } else if(appearance.equals("windows")) {
            iguiFactory = new WinFactory();
        } else {
            System.out.println("No such operating system");
        }
        IButton button = iguiFactory.createButton();
        button.paint();
    }
    public  static String randomAppearance() {
        String[] appearances = new String[3];
        appearances[0] = "osx";
        appearances[1] = "windows";
        appearances[2] = "error";
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return appearances[randomNumber];
    }
}
