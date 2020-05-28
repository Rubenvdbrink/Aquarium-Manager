package nl.hu.bep.model.personen;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public class MyUser implements Principal {
    private static List<MyUser> allMyUsers = new ArrayList<>();
    private String username;
    private String plainpassword;
    private String role;

    public MyUser(String username, String plainpassword) {
        this.username = username;
        this.plainpassword = plainpassword;
        this.role = "user";
        if(!allMyUsers.contains(this)) {
            allMyUsers.add(this);
        }
    }

    public void setAdmin() {
        this.role = "admin";
    }

    @Override
    public String getName() {
        return this.username;
    }

    public String getRole() {
        return this.role;
    }

    public static MyUser getUserByUsername(String username) {
        return allMyUsers.stream()
                .filter(e -> e.username.equals(username))
                .findFirst()
                .orElse(null);
    }

    public static String validateLogin(String username, String password) {
        MyUser found = getUserByUsername(username);
        if (found!=null) {
            return password.equals(found.plainpassword) ? found.getRole(): null;
        }
        return null;
    }
}
