public class Vehicle implements IVehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the " + model);
    }

    public void drive() {
        System.out.println("Driving the " + model);
    }

    public void stop() {
        System.out.println("Stopping the " + model);
    }
}
