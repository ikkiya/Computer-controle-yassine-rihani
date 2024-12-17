package ma.xproce.computer.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Computer;
    String proc;
    String ram;
    String hardDrive;
    double price;

}
