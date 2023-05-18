package com.example.demo.Repository;

import com.example.demo.Schema.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<Ticket, Integer> {
}
