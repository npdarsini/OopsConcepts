package Encapsulation;

public class Engine {
    private boolean isRunning;

    public Engine() {
        this.isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }
}

