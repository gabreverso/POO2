public class VehicleMaker implements IVehicleMaker{
    private static VehicleMaker instance = null;

    private VehicleMaker() {
    }

    public static VehicleMaker getInstance() {
        if (instance == null) {
            instance = new VehicleMaker();
        }
        return instance;
    }

    public IVehicle makeVehicle(String model) {
        return new Vehicle(model);
    }
}
