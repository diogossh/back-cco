package br.com.api.cco.cco.model.veiculo;

public record DadosCadastroVeiculo(

        String placa

) {

    public Veiculo toVeiculo(){
        return new Veiculo(this);
    }



}
