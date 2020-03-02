package by.serg;

public class HumanDemo {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.greet();
        Human human2 = new Human("Albert Einstein", 64);
        human2.greet();
    }
}
