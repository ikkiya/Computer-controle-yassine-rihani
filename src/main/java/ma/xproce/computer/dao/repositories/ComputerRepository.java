package ma.xproce.computer.dao.repositories;

import ma.xproce.computer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {

    public List<Computer> findByProc(String model);

    public List<Computer> findByProcAndPrice(String proc, double price);
}

