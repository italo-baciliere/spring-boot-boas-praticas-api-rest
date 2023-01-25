package br.com.voll_med.api.repository.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.voll_med.api.model.medico.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
}