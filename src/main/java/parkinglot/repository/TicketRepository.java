package parkinglot.repository;

import parkinglot.models.Ticket;
import parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository implements ITicketRepository{
    Map<Long, Ticket> ticketDb;
    Long lastSaved;
    public TicketRepository() {
        this.ticketDb = new HashMap<>();
        this.lastSaved = 0L;
    }

    public Ticket getTicketById(Long id) {
        return ticketDb.get(id);
    }

    public Ticket saveTicket(Ticket ticket) {
        lastSaved++;
        ticket.setId(lastSaved);
        ticketDb.put(lastSaved, ticket);

        return ticketDb.get(lastSaved);
    }
}
