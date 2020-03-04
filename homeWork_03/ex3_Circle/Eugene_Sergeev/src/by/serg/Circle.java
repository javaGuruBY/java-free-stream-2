package by.serg;

public class Circle {
    // Fields
    public double radius;

    // Methods
    public double calculateArea() {
        double circleArea = 2 * 3.14 * radius * radius;
        System.out.println("Area is equal to " + circleArea);
        return circleArea;
    }

    // Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
}
