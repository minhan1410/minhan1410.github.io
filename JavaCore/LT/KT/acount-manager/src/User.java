/**
 * User
 */
public class User {
    private long id;
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.id = IdGenerator.getNewUserID();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + username + " - " + " - " + email + " - " + password;
    }

}