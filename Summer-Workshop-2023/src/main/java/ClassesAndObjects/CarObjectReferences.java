package ClassesAndObjects;

public class CarObjectReferences {

    String color;
    String make;
    String model;

    public CarObjectReferences(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public static void main(String[] args) {
        CarObjectReferences car1 = new CarObjectReferences("red", "Toyota", "Camry");
        CarObjectReferences car2 = car1;

        System.out.println("car1: " + car1.color + " " + car1.make + " " + car1.model);

        car2.changeColor("blue");
        System.out.println("car2: " + car2.color + " " + car2.make + " " + car2.model);

        // What is the value of car1.color?
        // System.out.println("car1: " + car1.color + " " + car1.make + " " + car1.model);
        car2.testReference(car1);

        // What is the value of car1.color?
        // System.out.println("car1: " + car1.color + " " + car1.make + " " + car1.model);

        // What is the value of car2.color?
        // System.out.println("car2: " + car2.color + " " + car2.make + " " + car2.model);

    }

    static void testReference(CarObjectReferences car) {
        car.changeColor("green");
        System.out.println("car inside reference method: " + car.color + " " + car.make + " " + car.model);
    }
}
