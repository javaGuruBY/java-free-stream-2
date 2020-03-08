package by.alhr;

import javax.xml.soap.SOAPPart;

public class Dog {
    public int age;
    public String color;
    public String name;

    public Dog (){

    }

    public Dog (int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice (){
        System.out.println("I speak gaf-gaf");
    }
    public void eat(){
        System.out.println("I like eat meat");
    }
    public void sleep(){
        System.out.println("I sleep everything time");
    }
}
