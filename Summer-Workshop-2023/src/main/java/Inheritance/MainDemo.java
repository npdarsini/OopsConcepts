package Inheritance;

public class MainDemo {
    public static void main(String[] args) {

//        Car car = new Car("Red", "Ford", "Mustang");
//        Sedan myCar = new Sedan("Red", "Ford", "Mustang", 2015);
//
//        myCar.drive();
//        myCar.stop();
//        myCar.paintMySedan("Blue");
//
//        System.out.println("My car is a " + myCar.getYear() + " " + myCar.getColor() + " " + myCar.getMake() + " " + myCar.getModel());
//
//
//        SUV suv = new SUV("red", "Tesla", "Y", 2023, 5);
//        suv.paintMySuv("Green");
//        suv.setCapacity(7);
//
//        System.out.println("My SUV is a " + suv.getYear() + " " + suv.getColor() + " " + suv.getMake() + " " + suv.getModel() + " with a capacity of " + suv.getCapacity());

        PremiumCar premiumCar = new PremiumCar("red", "Tesla", "Y", 2023);
        premiumCar.setAutoPilot(true);
        premiumCar.setAutoLaneChange(true);
        premiumCar.setEngine("Turbo");
        premiumCar.setInterior("Leather");

        System.out.println("My Premium Car is a " + premiumCar.getYear()
                + " " + premiumCar.getColor() +
                " " + premiumCar.getMake() +
                " " + premiumCar.getModel() +
                " and an engine of " + premiumCar.getEngine() +
                " and has auto pilot " + premiumCar.getAutoPilot() +
                " and auto lane change " + premiumCar.getAutoLaneChange()
                + " and a " + premiumCar.getInterior() + " interior");


    }
}
