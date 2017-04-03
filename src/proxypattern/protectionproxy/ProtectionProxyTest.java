package proxypattern.protectionproxy;

/**
 * Created by bhushan on 18/3/17.
 */
public class ProtectionProxyTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        User admin = User.findUserByUsernameAndPassword("admin", "password");
        ProxyFolder folder = new ProxyFolder(admin);
        folder.readFile(String.format("%s/%s/readme",System.getProperty("user.dir"), "src/proxypattern/protectionproxy"));
        User user = User.findUserByUsernameAndPassword("user", "password1");
        ProxyFolder proxyFolder = new ProxyFolder(user);
        proxyFolder.readFile("readme");
    }
}
