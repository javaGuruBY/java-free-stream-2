package by.KorshakSergey;
import java.util.Random;
public class RandomGeneratorDemo {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int firstRandom = randomGenerator.nextInt(58);
        int secondRandom = randomGenerator.nextInt(37);
        int thirdRandom = randomGenerator.nextInt(13);
        System.out.println("firstRandom = " + firstRandom);
        System.out.println("secondRandom = " + secondRandom);
        System.out.println("thirdRandom = " + thirdRandom);

        int resultSum = firstRandom + secondRandom + thirdRandom;
        System.out.println("resultSum= " + resultSum);





    }
}
