package br.com.voll_med.api.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    UserDetails findByLogin(String login);
    
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.custom-implementations
}