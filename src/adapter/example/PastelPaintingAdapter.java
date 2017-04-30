package adapter.example;

import adapter.example.legacy.PastelPainting;

/**
 * Created by bhushan on 30/4/17.
 */
public class PastelPaintingAdapter implements IPainting {
    PastelPainting pastelPainting = new PastelPainting();
    @Override
    public void paint() {
        pastelPainting.doPaint();
    }
}
