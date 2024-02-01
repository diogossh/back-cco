package br.com.api.cco.cco.respository;

import br.com.api.cco.cco.model.veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
