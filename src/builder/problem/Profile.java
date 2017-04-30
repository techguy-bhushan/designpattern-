package builder.problem;

/**
 * Created by bhushan on 30/4/17.
 */
public class Profile {
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
    private String country;
    private String state;
    private String zip;
    private String hobby;
    private String about;
    private int age;

    public Profile(String email, String phone, String firstName, String lastName, String country, String state, String zip, String hobby, String about, int age) {
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.state = state;
        this.zip = zip;
        this.hobby = hobby;
        this.about = about;
        this.age = age;
    }

}
