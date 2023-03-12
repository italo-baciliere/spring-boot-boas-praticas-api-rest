package br.com.voll_med.api.controller.pacientes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

//    @GetMapping
//    public ResponseEntity listarPacientes(){
//        return ResponseEntity.status(HttpStatus.OK).body("Teste");
//    }
    @GetMapping
    public String listarPacientes(){
        return "Teste";
    }

}
