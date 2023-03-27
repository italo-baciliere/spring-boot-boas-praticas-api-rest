package br.com.voll_med.api.domain.paciente;

import br.com.voll_med.api.domain.endereco.Endereco;
import jakarta.persistence.*;

@Table(name= "pacientes")
@Entity
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Boolean ativo;
    @Embedded
    private Endereco endereco;
}
