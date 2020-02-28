package by.lemeshonok;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt(35);
        int randomNumber = randomGenerator.nextInt(100);
        int sum = (unboundRandom + boundRandom + randomNumber);
        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom = " + boundRandom);
        System.out.println(randomNumber);
        System.out.println(sum);










    }

}
