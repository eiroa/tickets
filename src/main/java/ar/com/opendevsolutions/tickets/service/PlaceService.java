package ar.com.opendevsolutions.tickets.service;

import ar.com.opendevsolutions.tickets.persistance.utils.TicketRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.Function;


@Service
@Transactional
@Data
public class PlaceService {

    @Autowired
    TicketRepository ticketRepository;

    public PlaceService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }


//    public String getClientsByBirthDate(Date date){
//        return this.ticketRepository.findByBirthDate(date).get(0).getName();
//    }

    Function lambda = (a) -> a;
}
