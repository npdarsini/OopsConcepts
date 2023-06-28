package Inheritance;

public class Car {
    String color;
    String make;
    String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving the " + this.color + " " + this.make + " " + this.model);
    }

    public void stop() {
        System.out.println("Stopping the " + this.color + " " + this.make + " " + this.model);
    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return this.color;
    }

}
