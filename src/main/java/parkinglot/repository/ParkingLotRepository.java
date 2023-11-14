package parkinglot.repository;

import parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository implements IParkingLotRepository{
    Map<Long, ParkingLot> parkingLotDb ;
    Long lastSaved ;
    public ParkingLotRepository() {
        this.parkingLotDb = new HashMap<>();
        this.lastSaved = 0L;
    }

    public ParkingLot getParkingLotById(Long id) {
        return parkingLotDb.get(id);
    }
    public ParkingLot saveParkingLot(ParkingLot parkingLot) {
        lastSaved++;
        parkingLot.setId(lastSaved);
        parkingLotDb.put(lastSaved, parkingLot);

        return  parkingLotDb.get(lastSaved);
    }

}
