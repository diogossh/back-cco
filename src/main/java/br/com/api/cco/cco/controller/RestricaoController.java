package br.com.api.cco.cco.controller;


import br.com.api.cco.cco.model.restricao.DadosCadastroRestricao;
import br.com.api.cco.cco.model.restricao.Restricao;
import br.com.api.cco.cco.respository.RestricaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("veiculo")
public class RestricaoController {

    @Autowired
    RestricaoRepository repository;





    public void novo_veiculo_com_restricao(@RequestBody @Valid DadosCadastroRestricao dados){
        repository.save( new Restricao(dados));



    }









}
