package by.evgKor;

public class Dog {
    public int age;
    public String color;
    public String name;
    public Dog(){

    }
    public Dog(int age, String color,String name){
        this.age=age;
        this.color=color;
        this.name=name;
    }
    public void voice(int age,String name,String color){
        System.out.println("Hello, my name is "+name+", I'm "+color+" color"+" I'm "+age+" years old "+"and I can bark woof woof");

    }
    public void eat(String name){
        System.out.println(name+" want to eat");
    }
    public void sleep(int age){
        if(age>8){
            System.out.println("I want to sleep, because I'm very old");
        }
        else System.out.println("I want to play, don't sleep");
    }
}
