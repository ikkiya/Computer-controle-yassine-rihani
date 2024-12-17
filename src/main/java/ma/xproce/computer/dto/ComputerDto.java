package ma.xproce.computer.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDto {
    Long id_Computer;
    String proc;
    String ram;
    String hardDrive;
    double price;

}