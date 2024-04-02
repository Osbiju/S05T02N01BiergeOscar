package cat.itacademy.barcelonactiva.BiergeOscar.s05t01n01.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id")
    private Long id;
    @Column(name = "player_name")
    private String playerName;
    @Column(name = "creation_date")
    private Date creationDate;

}
