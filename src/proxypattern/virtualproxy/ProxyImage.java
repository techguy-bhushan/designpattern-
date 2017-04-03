package proxypattern.virtualproxy;

/**
 * Created by bhushan on 18/3/17.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    @Override
    public void displayImage() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

}
