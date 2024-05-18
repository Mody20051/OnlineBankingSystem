package Resources;
import java.util.ArrayList;
import java.util.Scanner;

public class User extends Personalnformation{
    private String username;
    private String password;
     ArrayList<User> users = new ArrayList<>();
    Personalnformation personalnformation;
    public User() {
        this.username = "";
        this.password = "";
    }

    public User(String username, String password) {
       this.username=username;
       this.password=password;
    }

    public User(String username, String password, Personalnformation personalnformation) {
        this.username = username;
        this.password = password;
        this.personalnformation = personalnformation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws IllegalArgumentException {
        if (!validateUsername(username)) {
            throw new IllegalArgumentException("Username can only contain letters."); // swing
        }
        this.username = username;
    }

    public boolean validateUsername(String username) {
        return username.matches("[a-zA-Z]+");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (password.length() != 8) {
            throw new IllegalArgumentException("Password must be 8 characters long.");
        }
        this.password = password;
    }
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("The user is Successfully registered");
                return true;
            }
        }
        return false;
    }
        public boolean register(Personalnformation personalnformation){
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    System.out.println("The user is already used");
                    return true;
                }
            }
            return false;
        }
}