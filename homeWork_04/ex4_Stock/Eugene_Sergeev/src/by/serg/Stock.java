package by.serg;

public class Stock {
    private String companyName;
    private double currentPrice;
    private double minimalPrice;
    private double maximumPrice;

    // Methods
    public void updatePrice(double newPrice) {
        currentPrice = newPrice;
        if (newPrice > maximumPrice) {
            maximumPrice = newPrice;
        }
        if (newPrice < minimalPrice) {
            minimalPrice = newPrice;
        }
    }

    public String printInformation() {
        System.out.println("Company name = " + companyName + ", current price = " + currentPrice + " $, maximum price = " + maximumPrice + " $, minimal price = " + minimalPrice + " $");
        return ("Company name = " + companyName + ", current price = " + currentPrice + " $, maximum price = " + maximumPrice + " $, minimal price = " + minimalPrice + " $");
    }

    // Constructors
    public Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        minimalPrice = currentPrice;
        maximumPrice = currentPrice;
    }

}
