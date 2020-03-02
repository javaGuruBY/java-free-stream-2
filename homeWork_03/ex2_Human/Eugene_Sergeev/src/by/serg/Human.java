package by.serg;

public class Human {
    // Properties
    public String name;
    public int age;

    // Methods
    public void greet() {
        if (name != null && age != 0) {
            System.out.println("Hi! I'm " + name + " and i'm " + age + " years old");
        } else System.out.println("I won't tell you anything!");
    }

    // Constructors
    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
