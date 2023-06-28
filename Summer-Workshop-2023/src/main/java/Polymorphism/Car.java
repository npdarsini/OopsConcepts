package Polymorphism;

public class Car {

    String color;
    String make;
    String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public void setColor(String newColor) {
        System.out.println("Setting the color of Car to " + this.color);
        this.color = "white";

    }
}
