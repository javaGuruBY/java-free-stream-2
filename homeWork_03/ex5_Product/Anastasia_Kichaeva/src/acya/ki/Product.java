package acya.ki;

public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;

    }

    public double actualPrice(){
        return regularPrice - (regularPrice * discount) / 100;

    }
    public void printlnformation(){
        System.out.println("Product : name = " + name + ", regular price = " + regularPrice + " EUR, discount = " + discount + "%, actual price = " + actualPrice() + " EUR");

    }
}
