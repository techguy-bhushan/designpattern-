package builder.solution;

/**
 * Created by bhushan on 30/4/17.
 */
public class Test {
    public static void main(String[] args) {
        Profile profile = ProfileBuilder.builder()
                .setAge(26)
                .setEmail("bhushan.techguy@gmail.com")
                .setCountry("India").build();
        System.out.println(profile);
        Profile profile1 = ProfileBuilder.builder()
                .setEmail("bhushan.techguy@gmail.com")
                .setFirstName("Bhushan")
                .setLastName("Uniyal")
                .build();
        System.out.println(profile1);
    }

}
