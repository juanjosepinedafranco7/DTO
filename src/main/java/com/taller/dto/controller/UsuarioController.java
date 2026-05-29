package com.taller.dto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.dto.dto.UsuarioDTO;
import com.taller.dto.entity.Usuario;
import com.taller.dto.service.UsuarioService;


@RestController        
@RequestMapping("/usuarios")  
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


   
    @PostMapping
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario) {
        Usuario usuarioGuardado = usuarioService.registrar(usuario);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioGuardado);
    }


    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listar() {
        
        List<UsuarioDTO> lista = usuarioService.listarUsuarios();

        return ResponseEntity.ok(lista);
    }
}
