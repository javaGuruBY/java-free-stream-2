package by.SergeyKorshak;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circleOne = new Circle(15.85);
        System.out.println("the area of a circle with radius "+ circleOne.radius +", is equal to "
                           + circleOne.calculateArea(circleOne.radius));


        Circle circleTwo = new Circle();
        circleTwo.radius = 2.78;
        System.out.println("the area of a circle with radius "+ circleTwo.radius +", is equal to "
                + circleOne.calculateArea(circleTwo.radius));
    }
}
