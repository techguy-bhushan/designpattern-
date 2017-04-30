package builder.solution;

/**
 * Created by bhushan on 30/4/17.
 */
public class ProfileBuilder {
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

    public static ProfileBuilder builder() {
        return new ProfileBuilder();
    }


    public ProfileBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ProfileBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ProfileBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ProfileBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ProfileBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public ProfileBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public ProfileBuilder setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public ProfileBuilder setHobby(String hobby) {
        this.hobby = hobby;
        return this;
    }

    public ProfileBuilder setAbout(String about) {
        this.about = about;
        return this;
    }

    public ProfileBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Profile build() {
        return new Profile(email, phone, firstName, lastName, country, state, zip, hobby, about, age);
    }
}
