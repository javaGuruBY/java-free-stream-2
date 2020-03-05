package by.EvgKor;

import javax.swing.*;

public class Product {
    public String name;
    public double regularPrice;
    private double discount;

    public void setDiscount(double discount) {
        if(discount>100||discount<0){
            System.out.println("Incorrect discount. Please set discount in % from 0 to 100");
        } else{
            this.discount=discount;
        }

    }

    public double actualPrice(){
        return (regularPrice*(1-discount/100));
    }
    public Product(){

    }
    public Product(String name){
        this.name=name;
    }
    public void printInformation(){
        System.out.println("Product: "+name+", Regular price is "+regularPrice+" BYN"+", discount is "+discount+" %"+"actual price with discount "+actualPrice()+" BYN");
    }
}
