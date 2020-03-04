package by.serg;

public class Product {
    // Fields
    private String name;
    public double regularPrice;
    private double discount;

    // Methods
    public double actualPrice() {
        double actualPrice = regularPrice * (1 - discount / 100);
        return actualPrice;
    }

    public void printInformation() {
        System.out.println("Product: " + name + ", regular price = " + regularPrice + " BYN, discount = " + discount + "%, actual price = " + actualPrice() + " BYN");
    }

    // Constructors
    public Product(String name) {
        this.name = name;
    }

    public void setDiscount(double discount) {
        if (discount > 100 || discount < 0) {
            System.out.println("Incorrect discount. Please set discount in % from 0 to 100");
        } else {
            this.discount = discount;
        }
    }
}
