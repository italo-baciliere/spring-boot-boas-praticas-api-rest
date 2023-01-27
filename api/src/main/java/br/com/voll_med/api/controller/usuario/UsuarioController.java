package br.com.voll_med.api.controller.usuario;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.voll_med.api.domain.usuario.UsuarioRepository;

public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

}