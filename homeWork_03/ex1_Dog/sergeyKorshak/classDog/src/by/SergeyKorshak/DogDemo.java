package by.SergeyKorshak;

public class DogDemo {
    public static void main(String[] args) {

        Dog dogOne = new Dog();
        dogOne.name = "Baskerville";
        dogOne.color = "brown";
        dogOne.age = 16;
        dogOne.voice();
        dogOne.eat();
        dogOne.sleep();


        Dog dogTwo = new Dog("Malysh", "black", 2);
        dogTwo.voice();
        dogTwo.eat();
        dogTwo.sleep();

    }
}
