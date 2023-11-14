package parkinglot.models;

import parkinglot.models.types.SpotStatus;
import parkinglot.models.types.VehicleType;

import java.util.List;

public class Spot extends BaseModel{
    private SpotStatus status;
    private VehicleType vehicleType;
    private int floorId;
    private List<VehicleType> supportedVehicles;

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public List<VehicleType> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<VehicleType> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }
}
