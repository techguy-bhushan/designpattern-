package dependencyinjection.problemwithoutdependencyinjection;

/**
 * Created by bhushan on 3/4/17.
 */
public class SendContent {
   private EmailService emailService;
    SendContent() {
        emailService = new EmailService();
    }

    public void send(User user, String content) {
        emailService.send(user, content);
    }
}
