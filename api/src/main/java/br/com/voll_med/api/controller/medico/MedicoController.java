package br.com.voll_med.api.controller.medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.voll_med.api.model.medico.DadosAtualizacaoMedico;
import br.com.voll_med.api.model.medico.DadosCadastroMedico;
import br.com.voll_med.api.model.medico.DadosListagemMedico;
import br.com.voll_med.api.model.medico.Medico;
import br.com.voll_med.api.repository.medico.MedicoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    
    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dadosCadastroMedico){
        repository.save(new Medico(dadosCadastroMedico));
    }
 
    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size=10,sort={"especialidade"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }
    // http://localhost:8080/medicos?size=1 -> forma errada, de acordo com as boas práticas de api rest
    // http://localhost:8080/medicos?sort=nome  |  http://localhost:8080/medicos?sort=crm,desc
    // http://localhost:8080/medicos?sort=crm,desc&size=1&page=2
    // sort=nome -> atributo da entidade JPA
    // O cliente que define os parametros de ordenação 
    // É recomendado que você retorne para o cliente quais os parâmetro possíveis

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        Medico medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);        
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        Medico medico = repository.getReferenceById(id);
        medico.excluir();
    }
}