package br.com.voll_med.api.controller.autenticacao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.voll_med.api.domain.usuario.DadosAutenticacao;
import br.com.voll_med.api.domain.usuario.Usuario;
import br.com.voll_med.api.infra.security.DadosTokenJWT;
import br.com.voll_med.api.infra.security.TokenService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager; // dispara o processo de autenticacao

    @Autowired
    private TokenService tokenService;

    Logger logger = LogManager.getLogger(AutenticacaoController.class);

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados){

        logger.trace("TRACE");
        logger.debug("DEBUG - Gerando o token");
        logger.info("INFO"); // Produção
        logger.warn("WARN"); // ALerta, Conflitos, perda de dados
        logger.error("ERROR - Token não criado"); // quando ocorre algo inesperado. Blocos try catch.
        logger.fatal("FATAL"); // Crítico, Funcionalidade importante para de funcionar

        var tokenAutenticacao = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var authentication = manager.authenticate(tokenAutenticacao);

        var tokenJWT = tokenService.gerarToken((Usuario)authentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }    
    
}