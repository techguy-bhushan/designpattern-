package proxypattern.protectionproxy;

/**
 * Created by bhushan on 18/3/17.
 */
public class ProxyFolder implements IFolder {
    private Folder folder;
    private User user;
    public ProxyFolder(User user) {
        this.user = user;
    }

    @Override
    public void readFile(String fileName) {
        System.out.println("Proxy folder processing request.....");
        if (user != null && user.getRole() == User.Role.ADMIN) {
            System.out.println(String.format("Admin %s requesting to read file name: %s", user.getUsername(), fileName));
            folder = new Folder();
            folder.readFile(fileName);
        } else {
            System.out.println("Sorry! you have no access of read access");
        }
    }
}
