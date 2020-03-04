package by.SergeyKorshak;

public class Dog {
    public int age;
    public String color;
    public String name;

    public Dog() {
    }

    public Dog(String name, String color, int age) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("hi I'm a dog, my name is " + name + ", I'm " + color + ", I'm " + age + " years old, I say woof woof!!!");
    }

    public void eat() {
        System.out.println("I am a dog and I eat");
    }

    public void sleep() {
        System.out.println(age > 15 ? "I'm sleeping, don't Wake me, I'm very old" :
                "I'm asleep, you can Wake me up");
    }
}
