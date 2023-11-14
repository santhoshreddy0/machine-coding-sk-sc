package parkinglot.service;

import parkinglot.exceptions.ParkingLotNotFoundException;
import parkinglot.models.Ticket;
import parkinglot.models.Vehicle;

public interface ITicketService {
    public Ticket generateTicket(Long gateId, Vehicle vehicleDTO, Long parkingLotId) throws Exception;
}
