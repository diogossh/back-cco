package br.com.api.cco.cco.respository;

import br.com.api.cco.cco.model.restricao.Restricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestricaoRepository extends JpaRepository<Restricao, Long> {
}
