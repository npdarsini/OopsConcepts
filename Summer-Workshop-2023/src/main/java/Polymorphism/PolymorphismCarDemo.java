package Polymorphism;

public class PolymorphismCarDemo extends Car {

    public PolymorphismCarDemo(String color, String make, String model) {
        super(color, make, model);
    }

    public void setColor(String newColor) {
        System.out.println("Setting the color of PolymorphismCarDemo to " + this.color);
        this.color = newColor;
    }

    public void setColor(String newColor, String newMake) {
        System.out.println("Calling to set newColor and newMake");
        this.color = newColor;
        this.make = newMake;
    }

    public static void main(String[] args) {
//        PolymorphismCarDemo car = new PolymorphismCarDemo("white", "Toyota", "Camry");
//        System.out.println("The color of the car is " + car.color);
//        car.setColor("Red");
//        System.out.println("The color of the car is " + car.color);

//        Car car2 = new Car("yellow", "Toyota", "Camry");
//        System.out.println("The color of the car is " + car2.color);
//
//        car2.setColor("blue");
//        System.out.println("The color of the car is " + car2.color);
//
//        Car car3 = new PolymorphismCarDemo("green", "Toyota", "Camry");
//        System.out.println("The color of the car is " + car3.color);
//
//        car3.setColor("pink");
//        System.out.println("The color of the car is " + car3.color);
//
//        PolymorphismCarDemo car4 = new Car("green", "Toyota", "Camry");
//        System.out.println("The color of the car is " + car4.color);
//
        PolymorphismCarDemo car5 = new PolymorphismCarDemo("green", "Toyota", "Camry");
        System.out.println("The color of the car is " + car5.color + " and the make is "+ car5.make);

        car5.setColor("pink");
        System.out.println("The color of the car is " + car5.color + " and the make is "+ car5.make);

        car5.setColor("Black", "Audi");
        System.out.println("The color of the car is " + car5.color + " and the make is "+ car5.make);



    }

}
