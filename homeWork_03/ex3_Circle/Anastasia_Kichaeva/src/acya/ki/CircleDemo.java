package acya.ki;

public class CircleDemo {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(90);
        System.out.println("If the radius of circle = " + firstCircle.radius + ", then the area is " + firstCircle.calculateArea() + ".");

        Circle secondCircle = new Circle(14.4);
        System.out.println("If the radius of circle = " + secondCircle.radius + ", then the area is " + secondCircle.calculateArea() + ".");
    }
}
