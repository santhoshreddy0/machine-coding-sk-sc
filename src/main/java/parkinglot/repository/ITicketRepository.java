package parkinglot.repository;

import parkinglot.models.Ticket;

public interface ITicketRepository {
    public Ticket getTicketById(Long id);
    public Ticket saveTicket(Ticket ticket);
}
