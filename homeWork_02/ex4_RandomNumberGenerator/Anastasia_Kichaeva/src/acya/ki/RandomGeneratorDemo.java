package acya.ki;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int[] array = new int[3];
        int rand;
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            rand = r.nextInt();
            array[i] = (int) rand;
        }
        for (int c : array)
            System.out.println(c);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum += array[i];
        }
        System.out.println("Addition of random: " + sum);

    }
}
