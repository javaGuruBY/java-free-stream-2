package by.serg;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        circle1.calculateArea();
        circle1.radius = 10;
        circle1.calculateArea();
    }
}
