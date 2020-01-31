package ar.com.opendevsolutions.tickets.service;

import ar.com.opendevsolutions.tickets.persistance.utils.ClientRepository;
import ar.com.opendevsolutions.tickets.persistance.utils.TicketRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.function.Function;


@Service
@Transactional
@Data
public class TicketsService {

    @Autowired
    TicketRepository ticketRepository;

    public TicketsService( TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    Function lambda = (a) -> a;
}
