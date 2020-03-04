package by.SergeyKprshak;

public class ProductDemo {

    public static void main(String[] args) {
        Product  milk = new Product("milk");
        milk.regularPrice = 15;
        milk.setDiscount(-5.0);
        milk.printInformation();


        Product bread = new Product("bread");
        bread.regularPrice = 50;
        bread.setDiscount(18);
        bread.printInformation();

    }
}
