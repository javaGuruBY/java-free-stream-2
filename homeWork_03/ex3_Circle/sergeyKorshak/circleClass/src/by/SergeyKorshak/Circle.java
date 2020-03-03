package by.SergeyKorshak;

public class Circle {
    public double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public  double calculateArea(double radius){
        return Math.PI*Math.pow(radius, 2.0);
   }

}
