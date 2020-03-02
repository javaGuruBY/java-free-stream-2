package by.serg;

public class Dog {
    // Properties
    public int age;
    public String color;
    public String name;

    // Methods
    public void voice() {
        if (name != null) {
            System.out.println(name + " goes: Bark!");
        } else System.out.println("The dog barks");
    }

    public void eat() {
        if (name != null) {
            System.out.println("You fed " + name + " and now it looks happy");
        } else System.out.println("You fed the dog and now it looks happy");
    }

    public void sleep() {
        if (name != null) {
            System.out.println(name + " fells asleep");
        } else System.out.println("The dog fells asleep");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructors
    public Dog() {
    }

    public Dog(String name, String color, int age) {
        this.color = color;
        this.age = age;
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }
}
