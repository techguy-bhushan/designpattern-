package dependencyinjection.problemwithoutdependencyinjection;

/**
 * Created by bhushan on 3/4/17.
 */
public class User {
   private String email;
   private String mobileNumber;
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
