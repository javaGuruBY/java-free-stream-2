package by.alhr;

public class Human {
    public String name;
    public int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet(String name, int age) {
        System.out.println("Hi! My name is " + name + ", I'm " + age );

    }
}
