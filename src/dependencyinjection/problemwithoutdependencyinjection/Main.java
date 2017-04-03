package dependencyinjection.problemwithoutdependencyinjection;

/**
 * Created by bhushan on 3/4/17.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("aa@cc.com");
        user.setMobileNumber("11111111111111");
        SendContent sendContent = new SendContent();
        sendContent.send(user, "welcome user");
    }
}
