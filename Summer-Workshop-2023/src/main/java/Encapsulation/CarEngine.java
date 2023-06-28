package Encapsulation;

public class CarEngine {
    private String make;
    private String model;
    private int year;
    private Engine engine;

    public CarEngine(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String [] args) {
        CarEngine car = new CarEngine("Honda", "Accord", 2019);
        car.start();
        car.stop();
    }
}


