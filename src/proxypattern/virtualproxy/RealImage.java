package proxypattern.virtualproxy;

/**
 * Created by bhushan on 18/3/17.
 */
public class RealImage implements Image {
    private String fileName;

    @Override
    public void displayImage() {
        System.out.println(String.format("Loading Image %s (object hashcode %s)..........", fileName, this.hashCode()));
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
    }
}
