package by.alhr;

public class HumanDemo {
    public static void main(String[] args) {
        Human humanAlex = new Human("Alex", 30);
        humanAlex.greet(humanAlex.name, humanAlex.age);

        Human humanKris = new Human("Kris", 22);
        humanKris.greet(humanKris.name, humanKris.age);
    }
}
