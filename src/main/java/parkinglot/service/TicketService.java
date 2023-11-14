package parkinglot.service;

import parkinglot.dtos.VehicleDTO;
import parkinglot.exceptions.GateNotFoundException;
import parkinglot.exceptions.NoSpotFoundException;
import parkinglot.exceptions.ParkingLotNotFoundException;
import parkinglot.models.*;
import parkinglot.repository.IGateRepository;
import parkinglot.repository.IParkingLotRepository;
import parkinglot.repository.ITicketRepository;
import parkinglot.repository.IVehicleRepository;
import parkinglot.strategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService implements ITicketService {

    private IParkingLotRepository parkingLotRepository;
    private IVehicleRepository vehicleRepository;
    private ITicketRepository ticketRepository;
    private IGateRepository gateRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;

    public TicketService(IParkingLotRepository parkingLotRepository, IVehicleRepository vehicleRepository, ITicketRepository ticketRepository, IGateRepository gateRepository, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.parkingLotRepository = parkingLotRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    @Override
    public Ticket generateTicket(Long gateId, Vehicle vehicleFromRequest, Long parkingLotId) throws ParkingLotNotFoundException, GateNotFoundException, NoSpotFoundException {

        /*
         *  Validate request
         * create vehicle
         * get gat by id
         * get operator from gate id or get from request
         * generate ticket
         * send ticket
         * */

        Optional<ParkingLot> parkingLot = Optional.ofNullable(parkingLotRepository.getParkingLotById(parkingLotId));
        if(parkingLot.isEmpty()) {
            throw new ParkingLotNotFoundException("Parking lot not found");
        }
        Optional<Vehicle> vehicle = Optional.ofNullable(vehicleRepository.getVehicleById(vehicleFromRequest.getVehicleNumber()));
        if(vehicle.isEmpty()) {
            vehicle = Optional.ofNullable(vehicleRepository.saveVehicle(vehicleFromRequest));
        }
        Optional<Gate> gate = Optional.ofNullable(gateRepository.getGateById(gateId));
        if(gate.isEmpty()) {
            throw new GateNotFoundException("Gate Not found");
        }

        Optional<Spot> spot = Optional.ofNullable(spotAssignmentStrategy.findSpot(parkingLot.get(), vehicle.get().getVehicleType()));
        if(spot.isEmpty()) {
            throw new NoSpotFoundException("No spot availabel");
        }

        Ticket ticket = new Ticket(spot.get(), vehicle.get(), gate.get(), new Date(), gate.get().getOperator());



        return ticket;
    }
}
