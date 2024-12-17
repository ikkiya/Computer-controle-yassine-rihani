package ma.xproce.computer.mapper;

import ma.xproce.computer.dao.entities.Computer;
import ma.xproce.computer.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDto ComputerDto){
        return mapper.map(ComputerDto, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }

}
