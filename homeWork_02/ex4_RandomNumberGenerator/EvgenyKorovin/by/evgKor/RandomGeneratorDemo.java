package by.evgKor;
import java.util.Arrays;
import java.util.Random;
public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int num1 = randomGenerator.nextInt(50);
        int num2 = randomGenerator.nextInt(60);
        int num3 = randomGenerator.nextInt(55);
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);
        System.out.println("num3= "+num3);
        int result=num1*num2*num3;
        System.out.println("calculation result= "+result);



    }
}
