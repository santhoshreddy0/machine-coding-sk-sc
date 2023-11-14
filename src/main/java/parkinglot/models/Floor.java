package parkinglot.models;

import java.util.List;

public class Floor extends BaseModel{
    private int floorNum;
    private List<Spot> parkingSpots;

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public List<Spot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<Spot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
