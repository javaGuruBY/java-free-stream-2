package by.serg;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogge = new Dog();
        dogge.setColor("Ginger");
        dogge.voice();
        dogge.eat();
        dogge.sleep();
        Dog dogge2 = new Dog("Dog-meat", "Grey", 6);
        dogge2.voice();
        dogge2.eat();
        dogge2.sleep();
    }

}
