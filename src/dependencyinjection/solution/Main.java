package dependencyinjection.solution;

/**
 * Created by bhushan on 3/4/17.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setMobileNumber("1236547896");
        user.setEmail("xa@b.com");

        SendContentService sendContentService = ContentSenderFactory.getSendContentService(user.getSendContentType());
        SendContent sendContent = new SendContent(sendContentService);
        sendContent.process(user,"Welcome to design pattern");

        user.setSendContentType(SendContentType.SMS);
        sendContentService = ContentSenderFactory.getSendContentService(user.getSendContentType());
        SendContent sendContent1 = new SendContent(sendContentService);
        sendContent1.process(user,"Welcome to design pattern");
    }
}
