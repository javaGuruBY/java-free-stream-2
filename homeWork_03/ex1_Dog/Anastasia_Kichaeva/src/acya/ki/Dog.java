package acya.ki;

public class Dog {
    public int age;
    public String color;
    public String name;

    public Dog(int age, String color,String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("Hello! My name is " + name + ". I'm " + color + " color. I'm " + age + " years old. And I say Gaf! Gaf!");
    }

    public void eat() {
        System.out.println("My favorite food is meat and cookies!");
    }

    public void sleep() {
        if (age >= 10) {
            System.out.println("I'm very old and want to sleep...");
        }
        else
            System.out.println("I'm full of energy, let's play!!!");
    }

}
