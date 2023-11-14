package parkinglot;

import parkinglot.controllers.TicketController;
import parkinglot.dtos.TicketRequestDTO;
import parkinglot.dtos.VehicleDTO;
import parkinglot.models.Vehicle;

public class Client {
    public static void main(String[] args) throws Exception{
        TicketController controller = new TicketController();

        VehicleDTO vehicleDTO = new VehicleDTO();

        TicketRequestDTO requestDTO = new TicketRequestDTO();

        requestDTO.setGateId(1L);
        requestDTO.setVehicleDTO(vehicleDTO);
        requestDTO.setParkingLotId(12L);

        controller.issueTicket(requestDTO);

        System.out.println("client");
    }
}
