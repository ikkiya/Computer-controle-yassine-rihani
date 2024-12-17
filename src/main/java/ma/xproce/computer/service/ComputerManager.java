package ma.xproce.computer.service;

import lombok.AllArgsConstructor;
import ma.xproce.computer.dao.entities.Computer;
import ma.xproce.computer.dao.repositories.ComputerRepository;
import ma.xproce.computer.dto.ComputerDto;
import ma.xproce.computer.mapper.ComputerMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Service
@Component
@AllArgsConstructor
public class ComputerManager implements ComputerService {

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return computerDto;


    }

    @Override
    public boolean deleteComputer(Long id) {
        try {
            computerRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<ComputerDto> getComputerByProc(String proc) {
        List<Computer> computers = computerRepository.findByProc(proc);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }

    @Override
    public List<ComputerDto> getComputerByProcAndPrice(String proc, double price) {
        List<Computer> computers = computerRepository.findByProcAndPrice(proc, price);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }


}