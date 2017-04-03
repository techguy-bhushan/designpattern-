package dependencyinjection.solution;


/**
 * Created by bhushan on 3/4/17.
 */
public class SendContent {
    private SendContentService sendContentService;
    SendContent(SendContentService sendContentService) {
        this.sendContentService = sendContentService;
    }

    public void send(User user, String content) {
        sendContentService.send(user, content);
    }
}
