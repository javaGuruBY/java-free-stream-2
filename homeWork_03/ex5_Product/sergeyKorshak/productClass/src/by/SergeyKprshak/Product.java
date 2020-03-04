package by.SergeyKprshak;

public class Product {
    public String name;
    public double regularPrice;
    private double discount;


    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount < 0 || discount > 100)
            System.out.println("Incorrect discount. Please set discount in % from 0 to 100");
        else
            this.discount = discount;
    }

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return (regularPrice * (1 - discount / 100));
    }

    public void printInformation() {
        System.out.println("Product: name = " + name + ", regular prise = " + regularPrice + "$, discount = " + discount + "%,"
                + " actual prise = " + actualPrice() + "$");
    }
}

