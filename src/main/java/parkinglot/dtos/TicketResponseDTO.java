package parkinglot.dtos;

import java.util.Date;

public class TicketResponseDTO {
    private Long spotId;
    private String message;
    private Date date;
    private String vehicleNumber;

    public TicketResponseDTO(String message) {
        this.message = message;
    }

    public TicketResponseDTO(Long spotId, String message, Date date, String vehicleNumber) {
        this.spotId = spotId;
        this.message = message;
        this.date = date;
        this.vehicleNumber = vehicleNumber;
    }

    public Long getSpotId() {
        return spotId;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
