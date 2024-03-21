public class App {
    public static void main(String[] args) throws Exception {
        IVehicleMaker maker = VehicleMaker.getInstance();

        IVehicle corolla = maker.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();

        IVehicle civic = maker.makeVehicle("Civic");
        civic.start();
        civic.drive();
        civic.stop();
    }

}
