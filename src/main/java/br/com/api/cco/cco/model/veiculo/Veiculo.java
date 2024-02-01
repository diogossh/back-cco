package br.com.api.cco.cco.model.veiculo;


import br.com.api.cco.cco.model.restricao.Restricao;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculo {


    @ManyToMany
    @JoinTable(
            name = "veiculo_restricao",
            joinColumns = @JoinColumn(name = "id_restricao"),
            inverseJoinColumns = @JoinColumn(name = "id_veiculo")


    )





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
    private String informacao;
    private List<Restricao> restricoes;

    public Veiculo(DadosCadastroVeiculo dados){
        this.placa = dados.placa();
    }















}
