package dependencyinjection.solution;

/**
 * Created by bhushan on 3/4/17.
 */
public class User {
    private String email;
    private String mobileNumber;
    private SendContentType sendContentType  =SendContentType.EMAIL;

    public SendContentType getSendContentType() {
        return sendContentType;
    }

    public void setSendContentType(SendContentType sendContentType) {
        this.sendContentType = sendContentType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
