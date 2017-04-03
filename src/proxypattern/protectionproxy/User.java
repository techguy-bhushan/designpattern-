package proxypattern.protectionproxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by bhushan on 18/3/17.
 */
public class User {
    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    private static final List<User> users = getDummyUsers();
    private String username;
    private String password;
    private Role role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public static enum  Role {
        ADMIN, USER
    }

    private static ArrayList<User> getDummyUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("admin", "password", Role.ADMIN));
        users.add(new User("user", "password1", Role.USER));
        return users;
    }

    public static User findUserByUsernameAndPassword(String username, String password) {
        Optional<User> user = users.stream().filter(u-> u.getUsername().equals(username) && u.getPassword().equals(password)).findAny();
        return user.isPresent() ? user.get() : null;
    }
}
