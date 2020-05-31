package nl.hu.bep.model.personen;

import nl.hu.bep.model.AquariumManager;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public abstract class MyUser implements Principal {
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

    public Eigenaar getEigenaar() {
        for (Eigenaar eigenaar : AquariumManager.getAlleEigenaren()) {
            if (eigenaar.getName().equals(this.username)) {
                return eigenaar;
            }
        }
        return null;
    }

    /**
     * Methods
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyUser myUser = (MyUser) o;

        return username != null ? username.equals(myUser.username) : myUser.username == null;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "username='" + username + '\'' +
                ", plainpassword='" + plainpassword + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static String validateLogin(String username, String password) {
        MyUser found = getUserByUsername(username);
        if (found!=null) {
            return password.equals(found.plainpassword) ? found.getRole(): null;
        }
        return null;
    }

    //WIP
    public void removeEigenaar() {
        AquariumManager.getAlleEigenaren().remove(this);
        this.username = "ioawdiawmwkjhdukajhid";
        this.plainpassword = "uiwhdiuawkt65tghbjiu7ygbhnjkijuhud";
    }
}
