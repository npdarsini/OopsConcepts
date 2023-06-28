package InterfacesDemo;

public class SUV extends Car implements Drivable {

    public SUV(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting SUV...");
        // Additional SUV-specific start logic
    }

    @Override
    public void stop() {
        System.out.println("Stopping SUV...");
        // Additional SUV-specific stop logic
    }

    @Override
    public void drive() {
        System.out.println("Driving SUV...");
        // Additional SUV-specific drive logic
    }
}
