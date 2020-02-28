package by.ostapchuk;
import java.util.Random;
public class RandomGeneratorDemo {
    public static void main(String[] args){
        double a = Math.random()+20;
        Random random = new Random();
        int b = random.nextInt(100);
        double c = random.nextDouble();
        double sum = a+b+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(sum);
    }
}
