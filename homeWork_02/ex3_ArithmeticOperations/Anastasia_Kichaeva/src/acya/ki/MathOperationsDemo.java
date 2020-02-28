package acya.ki;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations Demo'!");
        double a = 1099999.57;
        double b = 77.35;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("1) Addition '+':");
        float sum = (float) (a + b);
        System.out.println("a + b = " + a + " + " + b + " = " + sum);

        System.out.println("2) Subtraction '-':");
        int diff = (int) (a - b);
        System.out.println("a - b = " + a + " - " + b + " = " + diff);

        System.out.println("3) Division '/':");
        short div = (short) (a / b);
        System.out.println("a / b = " + a + " / " + b + " = " + div);

        System.out.println("4) Multiplication '*':");
        long mult = (long) (a * b);
        System.out.println("a * b = " + a + " * " + b + " = " + mult);

        System.out.println("Good job!");
    }

}
