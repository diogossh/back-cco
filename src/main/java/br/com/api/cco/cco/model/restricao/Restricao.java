package br.com.api.cco.cco.model.restricao;


import br.com.api.cco.cco.model.veiculo.Veiculo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Restricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nomeRestricao;
    //private String tipoRestricao;
    //private String dataInicio;
    //private String dataFim;

    private List<Veiculo> veiculos;













}
