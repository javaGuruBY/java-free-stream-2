package by.serg;

public class UserLoginService {
    boolean login(User user, String password) {
        if (user.isBlocked(user)) {
            System.out.println("Login error: this user is blocked");
            return false;
        } else {
            if (password.equals(user.getUsersPassword(user))) {
                user.resetNumberOfTriesToLogin();
                return true;
            } else {
                user.increaseNumberOfTriesToLogin();
            }
        }
        return false;
    }
}
