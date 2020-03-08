package by.alhr;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        System.out.println(circle.radius + circle.calculateArea(circle.radius));
    }
}
