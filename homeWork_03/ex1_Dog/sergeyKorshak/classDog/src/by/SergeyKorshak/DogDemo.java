package by.SergeyKorshak;

public class DogDemo {
    public static void main(String[] args) {

        Dog dogOne = new Dog();
        dogOne.name = "Baskerville";
        dogOne.color = "brown";
        dogOne.age = 16;
        dogOne.voice(dogOne.name, dogOne.color, dogOne.age);
        dogOne.eat();
        dogOne.sleep(dogOne.age);


        Dog dogTwo = new Dog("Malysh", "black", 2);
        dogTwo.voice(dogTwo.name, dogTwo.color, dogTwo.age);
        dogTwo.eat();
        dogTwo.sleep(dogTwo.age);

    }
}
