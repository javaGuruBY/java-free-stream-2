package by.nlukash;

public class Product {

    public String name;
    public double regularPrice;
    public double discount;

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return regularPrice * (100 - discount) / 100;
    }
     public void printInformation()
     {
      System.out.println("Name: " + name + "\nRegularPrice: "+regularPrice + "\nDiscount: "+discount + "\nActualPrice: "+actualPrice());
    }
}
