package by.evgKor;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogNumOne=new Dog();
        dogNumOne.name="Bars";
        dogNumOne.color="Black";
        dogNumOne.age=6;
        dogNumOne.voice(dogNumOne.age,dogNumOne.name,dogNumOne.color);
        dogNumOne.eat(dogNumOne.name);
        dogNumOne.sleep(dogNumOne.age);
        Dog dogNumTwo=new Dog(15,"White","Din");
        dogNumTwo.voice(dogNumTwo.age,dogNumTwo.name,dogNumTwo.color);
        dogNumTwo.eat(dogNumTwo.name);
        dogNumTwo.sleep(dogNumTwo.age);

    }
}
