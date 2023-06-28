package Abstraction;

abstract class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}
