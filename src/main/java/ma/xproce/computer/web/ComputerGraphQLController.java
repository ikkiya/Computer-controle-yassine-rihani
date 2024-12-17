package ma.xproce.computer.web;

import lombok.AllArgsConstructor;
import ma.xproce.computer.dto.ComputerDto;
import ma.xproce.computer.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {

    private ComputerService computerService ;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computer){
        return computerService.saveComputer(computer);
    }

    @MutationMapping
    public Boolean deleteComputer(@Argument Long id){
        return computerService.deleteComputer(id);
    }


    @QueryMapping
    public List<ComputerDto> getComputerByProc(@Argument String proc){
        return computerService.getComputerByProc(proc);
    }

    @QueryMapping
    public List<ComputerDto> getComputerByProcAndPrice(@Argument String proc, @Argument double price){
        return computerService.getComputerByProcAndPrice(proc, price);
    }
}