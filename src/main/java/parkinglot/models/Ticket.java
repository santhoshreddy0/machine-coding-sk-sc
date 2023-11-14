package parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel{
//    spot
    private Spot spot;
    private Vehicle vehicle;
    private Gate gate;
    private Date entryTime;
    private Operator operator;

    public Ticket(Spot spot, Vehicle vehicle, Gate gate , Date date, Operator operator) {
        this.spot = spot;
        this.vehicle = vehicle;
        this.gate = gate;
        this.entryTime = date;
        this.operator = operator;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
