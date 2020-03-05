package by.EvgKor;

public class ProductDemo {
    public static void main(String[] args) {
        Product productNumOne=new Product("Beer");
        productNumOne.regularPrice=2.5;
        productNumOne.setDiscount(50);
        productNumOne.printInformation();
        Product productNumTwo=new Product("Crisps");
        productNumTwo.regularPrice=4;
        productNumTwo.setDiscount(15);
        productNumTwo.printInformation();
    }
}
