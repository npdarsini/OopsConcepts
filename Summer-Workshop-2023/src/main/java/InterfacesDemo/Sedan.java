package InterfacesDemo;

public class Sedan extends Car implements Drivable {
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

    @Override
    public void drive() {
        System.out.println("Driving Sedan...");
        // Additional Sedan-specific drive logic
    }

//    @Override
//    public void isAutoPilotEnabled(boolean status) {
//        if(status)
//            System.out.println("Sedan is autopilot enabled");
//        else
//            System.out.println("Sedan is not autopilot enabled");
//    }
}
