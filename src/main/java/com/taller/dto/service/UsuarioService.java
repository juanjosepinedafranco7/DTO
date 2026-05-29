package com.taller.dto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller.dto.dto.UsuarioDTO;
import com.taller.dto.entity.Usuario;
import com.taller.dto.repository.UsuarioRepository;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


 
    public Usuario registrar(Usuario usuario) {
        
        return usuarioRepository.save(usuario);
    }


 
   
    public List<UsuarioDTO> listarUsuarios() {

        List<Usuario> usuarios = usuarioRepository.findAll();

        List<UsuarioDTO> listaDTO = new ArrayList<>();

      
        for (Usuario usuario : usuarios) {

            UsuarioDTO dto = new UsuarioDTO();

            dto.setNombre(usuario.getNombre());   
            dto.setCorreo(usuario.getCorreo());   
            dto.setRol(usuario.getRol());       

          
            listaDTO.add(dto);
        }

        return listaDTO;
    }
}
