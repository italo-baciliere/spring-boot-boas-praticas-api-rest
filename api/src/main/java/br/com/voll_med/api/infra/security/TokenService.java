package br.com.voll_med.api.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import br.com.voll_med.api.domain.usuario.Usuario;

@Service
public class TokenService {

	public String gerarToken(Usuario usuario) { 
		try {
			var algorithm = Algorithm.HMAC256("123456");
			return JWT.create()
				.withIssuer("API Voll.med")
				.withSubject(usuario.getLogin())
				.withExpiresAt(dataExpiracao())
				.sign(algorithm);
		} catch (JWTCreationException exception){
			throw new RuntimeException("erro ao gerrar token jwt", exception);
		}
	}

	private Instant dataExpiracao() {    
		return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
	}

}