package ar.com.opendevsolutions.tickets.persistance.utils;

import ar.com.opendevsolutions.tickets.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ManagerRepository extends JpaRepository<Client,Long> {

    List<Client> findByBirthDate(Date birthDate);
}
