package Inheritance;

public class PremiumCar extends Sedan {

    private String engine;
    private boolean autoLaneChange;
    private boolean autoPilot;
    private String interior;


    public PremiumCar(String color, String make, String model, int year) {
        super(color, make, model, year);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setAutoLaneChange(boolean autoLaneChange) {
        this.autoLaneChange = autoLaneChange;
    }

    public boolean getAutoLaneChange() {
        return this.autoLaneChange;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    public boolean getAutoPilot() {
        return this.autoPilot;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getInterior() {
        return this.interior;
    }


}
