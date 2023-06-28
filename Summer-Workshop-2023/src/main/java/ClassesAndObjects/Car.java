package ClassesAndObjects;

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

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "Toyota", "Camry");
        Car car2 = new Car("blue", "Honda", "Accord");

        car1.drive();
        car1.stop();

        car2.drive();
        car2.stop();

        System.out.println("car1: " + car1.color + " " + car1.make + " " + car1.model);
        System.out.println("car2: " + car2.color + " " + car2.make + " " + car2.model);

        Car car3 = new Car("green", "Tesla", "3");
        car3.drive();
        car3.changeColor("black");
        car3.drive();

    }
}
