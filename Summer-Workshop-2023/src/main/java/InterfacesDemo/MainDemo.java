package InterfacesDemo;

public class MainDemo {
    public static void main(String[] args) {
        Car sedan = new Sedan("Toyota", "Camry", 2022);
        sedan.start();
        sedan.stop();

        Car suv = new SUV("Ford", "Explorer", 2022);
        suv.start();
        suv.stop();

        Car tesla = new Sedan("Tesla", "Model 3", 2022);
    }
}
