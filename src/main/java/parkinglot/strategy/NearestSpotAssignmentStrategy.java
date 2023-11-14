package parkinglot.strategy;

import parkinglot.models.Floor;
import parkinglot.models.ParkingLot;
import parkinglot.models.Spot;
import parkinglot.models.types.SpotStatus;
import parkinglot.models.types.VehicleType;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public Spot findSpot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(Floor floor : parkingLot.getFloors()) {
            for ( Spot spot : floor.getParkingSpots()) {
                if(isSpotAvailable(spot, vehicleType)) {
                    return spot;
                }
            }
        }
        return null;
    }
    private boolean isSpotAvailable(Spot spot, VehicleType vehicleType) {
        if(spot.getVehicleType().equals(vehicleType) && spot.getStatus().equals(SpotStatus.AVAILABLE)) {
            return true;
        }
        return false;
    }

}
