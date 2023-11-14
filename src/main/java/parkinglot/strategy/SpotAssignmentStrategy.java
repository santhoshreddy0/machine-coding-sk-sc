package parkinglot.strategy;

import parkinglot.models.ParkingLot;
import parkinglot.models.Spot;
import parkinglot.models.Vehicle;
import parkinglot.models.types.VehicleType;

public interface SpotAssignmentStrategy {
    public Spot findSpot(ParkingLot parkingLot, VehicleType vehicleType);
}
