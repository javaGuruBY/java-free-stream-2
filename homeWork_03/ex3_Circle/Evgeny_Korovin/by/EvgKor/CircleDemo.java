package by.EvgKor;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.radius=3;
        double Area1=circle.calculateRadius();
        System.out.println("When radius= "+ circle.radius+" then Area1 = "+Area1);
        circle.radius=2;
        double Area2=circle.calculateRadius();
        System.out.println("When radius= "+circle.radius+" then Area2 = "+Area2);


    }
}
