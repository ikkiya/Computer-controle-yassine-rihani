package ma.xproce.computer;

import ma.xproce.computer.dao.entities.Computer;

import ma.xproce.computer.dao.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerRepository computerRepository){
        return  args -> {

            List<Computer> computers = List.of(
                    Computer.builder().proc("proc1").ram("ddr4").hardDrive("ssd").price(23234).build(),
                    Computer.builder().proc("proc2").ram("ddr5").hardDrive("hdd").price(65489).build(),
                    Computer.builder().proc("proc3").ram("ddr4").hardDrive("ssd").price(89789).build(),
                    Computer.builder().proc("proc4").ram("ddr5").hardDrive("ssd").price(67489).build()
            );

            computerRepository.saveAll(computers);
        };



//
        };
    }

