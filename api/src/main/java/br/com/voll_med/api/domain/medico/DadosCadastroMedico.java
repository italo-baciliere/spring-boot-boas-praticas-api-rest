package br.com.voll_med.api.domain.medico;

import br.com.voll_med.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(

    @NotBlank(message = "{nome.obrigatorio}")
    String nome,

    @NotBlank
    @Email
    String email,

    @NotBlank
    String telefone,

    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,    

    @NotNull
    Especialidade especialidade,

    @NotNull @Valid
    DadosEndereco endereco

){}

// DTO
// record é um dto <data transfer object>