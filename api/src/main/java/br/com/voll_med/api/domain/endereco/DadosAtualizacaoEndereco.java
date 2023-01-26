package br.com.voll_med.api.domain.endereco;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoEndereco(    
    @NotNull
    Long id,
    String nome,    
    String telefone,
    Endereco endereco
)
{
    // public DadosAtualizacaoMedico(Medico medico){
    //     this(medico.getId(), medico.getNome(), medico.getTelefone(), medico.ge)
    // }
}