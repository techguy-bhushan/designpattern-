package adapter.example;

/**
 * Created by bhushan on 30/4/17.
 */
public class Test {
    public static void main(String[] args) {
        IPainting iPainting = new HyperrealismPainting();
        iPainting.paint();
        IPainting iPainting1 = new PastelPaintingAdapter();
        iPainting1.paint();

    }
}
