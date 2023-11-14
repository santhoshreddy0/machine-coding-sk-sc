package parkinglot.repository;

import parkinglot.models.ParkingLot;

public interface IParkingLotRepository {
    public ParkingLot getParkingLotById(Long id);
    public ParkingLot saveParkingLot(ParkingLot parkingLot);
}
