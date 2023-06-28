package Inheritance;

public class SUV extends Car {
    private int year;
    private int capacity;

    public SUV(String color, String make, String model, int year, int capacity) {
        super(color, make, model);
        this.year = year;
        this.capacity = capacity;
    }

    public void paintMySuv(String color) {
        System.out.println("Painting my SUV " + color);
        this.color = color;

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getYear() {
        return this.year;
    }
}
