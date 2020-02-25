package by.serg;

import java.util.Random;

public class RandomGeneratorDemo{
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int number1 = randomGenerator.nextInt();
        int number2 = randomGenerator.nextInt();
        int number3 = randomGenerator.nextInt();
        System.out.println("Your numbers are " + number1 + ", " + number2 + ", " + number3);
        int summ = number1 + number2 + number3;
        System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + summ);
    }
}