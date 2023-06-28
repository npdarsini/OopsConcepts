package ClassesAndObjects;

public class ProtectedCar {

    private String color = "blue";

    public void setColor(String color) {

        if(color.equalsIgnoreCase("red")) {
            return;
        }

        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
