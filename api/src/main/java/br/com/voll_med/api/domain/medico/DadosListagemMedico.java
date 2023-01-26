package br.com.voll_med.api.domain.medico;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosListagemMedico(

    @NotNull
    Long id,

    @NotBlank
    String nome,

    @NotBlank
    @Email
    String email,    

    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,    

    @NotNull
    Especialidade especialidade
){
    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}

// DTO
// record é um dto <data transfer object>