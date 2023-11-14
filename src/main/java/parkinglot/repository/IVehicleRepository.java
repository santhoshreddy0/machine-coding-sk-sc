package parkinglot.repository;

import parkinglot.models.Vehicle;

public interface IVehicleRepository {
    public Vehicle getVehicleById(String id);
    public Vehicle saveVehicle(Vehicle vehicle);
}
