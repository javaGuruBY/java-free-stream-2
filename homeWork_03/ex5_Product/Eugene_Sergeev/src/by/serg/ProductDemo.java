package by.serg;

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Milk");
        milk.regularPrice = 1.8;
        milk.setDiscount(65);
        milk.printInformation();
    }
}
