package parkinglot.controllers;

import parkinglot.dtos.TicketResponseDTO;
import parkinglot.dtos.TicketRequestDTO;
import parkinglot.dtos.VehicleDTO;
import parkinglot.exceptions.GateNotFoundException;
import parkinglot.exceptions.NoSpotFoundException;
import parkinglot.exceptions.ParkingLotNotFoundException;
import parkinglot.models.Ticket;
import parkinglot.models.Vehicle;
import parkinglot.repository.*;
import parkinglot.service.ITicketService;
import parkinglot.service.TicketService;
import parkinglot.strategy.SpotAssignmentStrategy;

public class TicketController {
    private IParkingLotRepository parkingLotRepository;
    private IVehicleRepository vehicleRepository;
    private ITicketRepository ticketRepository;
    private IGateRepository gateRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    public TicketResponseDTO issueTicket(TicketRequestDTO requestDTO) {

        ITicketService ticketService = new TicketService(parkingLotRepository, vehicleRepository, ticketRepository, gateRepository, spotAssignmentStrategy);
        Vehicle vehicle = VehicleDTOToVehicle(requestDTO.getVehicleDTO());
        Ticket ticket;
        try {
            ticket = ticketService.generateTicket(requestDTO.getGateId(), vehicle, requestDTO.getParkingLotId());
        } catch (GateNotFoundException e) {
            return new TicketResponseDTO("Invalid gate");
        } catch (ParkingLotNotFoundException e) {
            return new TicketResponseDTO("Invalid parking lot");
        } catch (NoSpotFoundException e) {
            return new TicketResponseDTO("No spots available!");
        } catch (Exception e) {
            return new TicketResponseDTO("Something went wrong");
        }
        return convertTicketToTicketResponseDTO(ticket);
    }
    private Vehicle VehicleDTOToVehicle(VehicleDTO vehicleDTO) {
        Vehicle v = new Vehicle();
        v.setVehicleNumber(vehicleDTO.getVehicleNumber());
        return v;
    }

    private TicketResponseDTO convertTicketToTicketResponseDTO(Ticket ticket) {
        return new TicketResponseDTO(ticket.getSpot().getId(), "Ticket generated.", ticket.getEntryTime(), ticket.getVehicle().getVehicleNumber());
    }


}
