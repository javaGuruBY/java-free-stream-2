package by.nlukash;


public class ProductDemo {

    public static void main(String[] args) {
        Product car = new Product("Volvo") ;
       car.regularPrice = 89.999;
        car.discount = 5;
        car.printInformation();
    }
}
