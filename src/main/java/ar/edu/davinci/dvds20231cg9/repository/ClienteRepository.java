package ar.edu.davinci.dvds20231cg9.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.edu.davinci.dvds20231cg9.domain.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
