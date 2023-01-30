package br.com.voll_med.api.controller.medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.voll_med.api.controller.medico.MedicoController;
import br.com.voll_med.api.domain.medico.DadosAtualizacaoMedico;
import br.com.voll_med.api.domain.medico.DadosCadastroMedico;
import br.com.voll_med.api.domain.medico.DadosDetalhamentoMedico;
import br.com.voll_med.api.domain.medico.DadosListagemMedico;
import br.com.voll_med.api.domain.medico.Medico;
import br.com.voll_med.api.domain.medico.MedicoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    
    @Autowired
    private MedicoRepository repository;    


    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroMedico dadosCadastroMedico, UriComponentsBuilder UriBuilder){
        Medico medico = new Medico(dadosCadastroMedico);
        repository.save(medico);
        var uri = UriBuilder.path("medicos/{id}").buildAndExpand(medico.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoMedico(medico));
    }
 
    @GetMapping
    public ResponseEntity<Page<DadosListagemMedico>> listar(@PageableDefault(size=10,sort={"especialidade"}) Pageable paginacao) {
        var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
        return ResponseEntity.ok(page);        
    }
    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        Medico medico = repository.getReferenceById(id);                
        return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));
    }
    // http://localhost:8080/medicos?size=1 -> forma errada, de acordo com as boas práticas de api rest
    // http://localhost:8080/medicos?sort=nome  |  http://localhost:8080/medicos?sort=crm,desc  |  http://localhost:8080/medicos?sort=crm,desc&size=1&page=2    
    // sort=nome -> atributo da entidade JPA
    // O cliente que define os parametros de ordenação 
    // É recomendado que você retorne para o cliente quais os parâmetro possíveis

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        Medico medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
        DadosDetalhamentoMedico dadosDetalhamento = new DadosDetalhamentoMedico(medico);
        return ResponseEntity.ok(dadosDetalhamento);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id){
        Medico medico = repository.getReferenceById(id);
        medico.excluir();
        return ResponseEntity.noContent().build();
    }
}

// HandleInterceptors
/*
 * 
*/

// Filters
/*
 * antes mesmo da execução do Spring 
 * onde decidimos se a requisição será interrompida ou se chamaremos ainda outro filter
*/