package com.example.demo.Services;




import com.example.demo.Repository.TicketRepo;
import com.example.demo.Schema.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    public Ticket bookTicket(Ticket ticket){
        ticketRepo.save(ticket);
        return ticket;
    }

    public List<Ticket> getTickets(){
        return (List<Ticket>) ticketRepo.findAll();
    }

}