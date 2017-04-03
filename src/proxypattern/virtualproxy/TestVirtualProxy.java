package proxypattern.virtualproxy;

/**
 * Created by bhushan on 18/3/17.
 */
public class TestVirtualProxy {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("photo_01");
        ProxyImage proxyImage1 = new ProxyImage("photo_02");
        proxyImage.displayImage();
        proxyImage.displayImage();
        proxyImage1.displayImage();
        proxyImage1.displayImage();
    }
}
