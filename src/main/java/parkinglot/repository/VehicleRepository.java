package parkinglot.repository;

import parkinglot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository implements IVehicleRepository{
    Map<String, Vehicle> vehicleDb;
    public VehicleRepository() {
        this.vehicleDb = new HashMap<>();
    }

    public Vehicle getVehicleById(String id) {
        return vehicleDb.get(id);
    }

    public Vehicle saveVehicle(Vehicle vehicle) {


        vehicleDb.put(vehicle.getVehicleNumber(), vehicle);

        return vehicleDb.get(vehicle.getVehicleNumber());
    }
}
