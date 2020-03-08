package acya.ki;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog(3, "orange", "Josef");
        firstDog.voice();
        firstDog.eat();
        firstDog.sleep();

        Dog secondDog = new Dog(15, "brown", "Grisha");
        secondDog.voice();
        secondDog.eat();
        secondDog.sleep();

    }
}
