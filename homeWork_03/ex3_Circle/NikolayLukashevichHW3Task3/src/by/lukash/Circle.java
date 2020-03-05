package by.lukash;

public class Circle {
    public double radius;

    public double calculateArea() {
        double circleArea = 3.14 * (radius * radius);
        System.out.println("Area is equal to " + circleArea);
        return circleArea;
    }

    public Circle(double radius) {
        this.radius = radius;
        }

    public Circle() {
        }
    }