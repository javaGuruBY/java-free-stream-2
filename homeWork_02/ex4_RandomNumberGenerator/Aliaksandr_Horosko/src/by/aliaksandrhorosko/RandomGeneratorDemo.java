package by.aliaksandrhorosko;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        double a = Math.random() * 5;
        double b = Math.random() * 10;
        double c = Math.random() * 1;
        double result = a + b + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(result);
    }
}
