package br.com.api.cco.cco.model.restricao;


import br.com.api.cco.cco.model.veiculo.Veiculo;
import jakarta.persistence.*;
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
    private Long id;
    private String nomeRestricao;
    //private String tipoRestricao;
    //private String dataInicio;
    //private String dataFim;





    @OneToMany(cascade = {CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinTable(
            name = "veiculo_restricao",
            joinColumns = @JoinColumn(name = "id_veiculo"),
            inverseJoinColumns = @JoinColumn(name = "id_restricao")
            )


    private List<Veiculo> veiculos;



public Restricao(DadosCadastroRestricao dados){
   this.id = dados.id();
   this.veiculos = List.of(dados.veiculo().toVeiculo());
}








}
