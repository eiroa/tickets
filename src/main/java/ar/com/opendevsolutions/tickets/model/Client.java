package ar.com.opendevsolutions.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Entity
@Table(name = "CLIENT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    Long id;

    @Column
    String name;

    @Column
    Integer personId;

    @Column
    String nationality;

    @Column
    Date birthDate;

    public static Client defaultClient() {
        Client c = new Client();
        c.id = 1L;
        c.birthDate = Date.from(Instant.now().minus(10000, ChronoUnit.DAYS));
        c.personId = 1234;
        c.nationality = "Terran";
        c.name = "Default";
        return c;
    }
}
