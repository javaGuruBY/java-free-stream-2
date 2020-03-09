package by.serg;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User user1 = new User("Eugene", "123qwerty");
        System.out.println(service.login(user1, "123qwert"));
        System.out.println(service.login(user1, "123qwertagain"));
        System.out.println(service.login(user1, "123qwerty"));
    }
}
