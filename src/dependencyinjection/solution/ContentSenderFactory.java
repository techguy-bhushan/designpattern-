package dependencyinjection.solution;

/**
 * Created by bhushan on 3/4/17.
 */
public class ContentSenderFactory {
    public static SendContentService getSendContentService(SendContentType contentType) {
        switch (contentType) {
            case EMAIL:
                return new EmailServiceImpl();
            case SMS:
                return new MessageServiceImpl();
        }
        return null;
    }
}
