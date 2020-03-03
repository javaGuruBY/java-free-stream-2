package by.SergeyKorshak;

public class HumanDemo {
    public static void main(String[] args) {
        Human humanSergey = new Human("Sergey", 27);
        humanSergey.greet(humanSergey.name, humanSergey.age);

        Human humanOlga = new Human("Olga", 24);
        humanOlga.greet(humanOlga.name, humanOlga.age);
   }
}
