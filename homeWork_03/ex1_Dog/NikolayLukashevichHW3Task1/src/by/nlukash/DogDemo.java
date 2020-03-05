package by.nlukash;

public class DogDemo {

    public static void main (String [] args) {

        Dog firstDog = new Dog("Samsung" , "black",10);
        Dog SecondDog = new Dog("Apple", "white", 5);

        firstDog.play();
        firstDog.voice();
        firstDog.sniff();

        SecondDog.play();
        SecondDog.voice();
        SecondDog.sniff();


    }
}
