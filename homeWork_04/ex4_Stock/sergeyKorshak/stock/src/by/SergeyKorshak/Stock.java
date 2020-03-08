package by.SergeyKorshak;

public class Stock {
    private String nameCompany;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;


    public Stock(String nameCompany, double currentPrice){
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    public  void updatePrice(double newPrice){
        currentPrice = newPrice;
        if (newPrice < minPrice)
            minPrice = newPrice;
        if (newPrice > maxPrice)
            maxPrice = newPrice;
    }

    public String printInformation(){
        System.out.println("Company = "+ nameCompany +", Current Price = "+currentPrice+"," +
                          " Min Price = "+minPrice+", Max Price = "+maxPrice);
        return  ("Company = "+ nameCompany +", Current Price = "+currentPrice+"," +
                " Min Price = "+minPrice+", Max Price = "+maxPrice);
    }
}
