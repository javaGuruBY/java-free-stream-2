package by.serg;

public class User {
    private String login;
    private String password;
    private int numberOfTriesToLogin;
    private boolean blocked;

    void resetNumberOfTriesToLogin() {
        numberOfTriesToLogin = 0;
    }
    void increaseNumberOfTriesToLogin() {
        numberOfTriesToLogin++;
        if (numberOfTriesToLogin >= 3) {
            blocked = true;
        }
    }
    void blockUser() {
        blocked = true;
    }
    String getUsersPassword(User name) {
        return password;
    }
    boolean isBlocked(User name) {
        return blocked;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
