package dependencyinjection.solution;



/**
 * Created by bhushan on 3/4/17.
 */
public class MessageServiceImpl implements SendContentService {
    @Override
    public void send(User user, String content) {
        System.out.println(String.format("Send message to: %s with content : %s", user.getMobileNumber(), content));
    }
}
