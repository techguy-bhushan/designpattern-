package dependencyinjection.solution;


/**
 * Created by bhushan on 3/4/17.
 */
public class EmailServiceImpl implements SendContentService {
    @Override
    public void send(User user, String content) {
        System.out.println(String.format("Send email to: %s with content : %s", user.getEmail(), content));
    }
}
