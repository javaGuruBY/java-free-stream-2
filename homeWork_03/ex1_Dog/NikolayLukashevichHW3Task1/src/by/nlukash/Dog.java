package by.nlukash;

import java.security.PublicKey;

public class Dog {
    public int age;
    public String name;
    public String color;

    public Dog () {

}

    public Dog (String name, String color, int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public void play () {
        System.out.println("Hello, I'm " + name + ", i'm is " + color + ". I'm " + age + "years old and I love to play");
        }

    public void voice () {
        System.out.println("Woof, woof woof! WoofWoofWoof - WOOF!");
    }
    public void sniff () {
    System.out.println("Your smell smells good");

    }

    }

