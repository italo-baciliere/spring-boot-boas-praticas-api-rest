package br.com.voll_med.api.domain.medico;

import br.com.voll_med.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(    
    @NotNull
    Long id,
    String nome,    
    String telefone,
    DadosEndereco endereco
){}