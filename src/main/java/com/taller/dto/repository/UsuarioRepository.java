package com.taller.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller.dto.entity.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
