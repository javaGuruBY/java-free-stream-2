package acya.ki;

public class ProductDemo {
    public static void main(String[] args) {
        Product firstProduct = new Product("Milk", 2, 20);
        firstProduct.printlnformation();

        Product secondProduct = new Product("Eggs", 4, 50);
        secondProduct.printlnformation();
    }
}
