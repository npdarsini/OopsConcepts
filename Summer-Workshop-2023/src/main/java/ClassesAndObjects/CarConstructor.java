package ClassesAndObjects;

public class CarConstructor {

    String color;
    String make;
    String model;

//    // default constructor
//    public CarConstructor() {
//        this.color = "blue";
//        this.make = "Honda";
//        this.model = "Accord";
//    }
//
//    public CarConstructor(String color, String make, String model) {
//        this.color = color;
//        this.make = make;
//        this.model = model;
//    }

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
        CarConstructor car1 = new CarConstructor();
//        CarConstructor car2 = new CarConstructor("red", "Toyota", "Camry");

        car1.drive();
        car1.stop();

//        car2.drive();
//        car2.stop();

        // default constructor comes by default

    }
}
