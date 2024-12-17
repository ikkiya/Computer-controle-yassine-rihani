package ma.xproce.computer.service;

import ma.xproce.computer.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    public ComputerDto saveComputer(ComputerDto computerDto);

    public boolean deleteComputer(Long id);

    public List<ComputerDto> getComputerByProc(String proc);

    public List<ComputerDto> getComputerByProcAndPrice(String proc, double price);

//    public List<AvionDto> saveAvions(List<AvionDto> avionDtos);

}
