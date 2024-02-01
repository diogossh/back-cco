package br.com.api.cco.cco.model.veiculo;


import br.com.api.cco.cco.model.restricao.Restricao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cor;
    private String marca;
    private String ano;
    private String modelo;
    private String nome;
    private String placa;
    private String tipoVeiculo;
    private List<Restricao> restricoes;

}
