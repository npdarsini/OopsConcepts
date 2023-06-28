package Abstraction;

public class Sedan extends Car {
    public Sedan(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting Sedan...");
        // Additional Sedan-specific start logic
    }

    @Override
    public void stop() {
        System.out.println("Stopping Sedan...");
        // Additional Sedan-specific stop logic
    }
}
