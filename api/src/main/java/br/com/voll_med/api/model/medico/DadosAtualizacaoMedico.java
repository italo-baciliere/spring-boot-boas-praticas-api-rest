package br.com.voll_med.api.model.medico;

import br.com.voll_med.api.model.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(    
    @NotNull
    Long id,
    String nome,    
    String telefone,
    DadosEndereco endereco
){}