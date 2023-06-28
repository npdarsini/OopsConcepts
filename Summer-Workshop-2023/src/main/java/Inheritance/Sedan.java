package Inheritance;

public class Sedan extends Car{
    private int year;

    public Sedan(String color, String make, String model, int year) {
        super(color, make, model);
        this.year = year;;
    }

    public void paintMySedan(String color) {
        System.out.println("Painting my Sedan " + color);
        this.color = color;

    }

    public int getYear() {
        return this.year;
    }

}
