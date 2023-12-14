package com.sweettentation9.repository;

import com.sweettentation9.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

    @Override
    Optional<Usuario> findById(Long id);

    Optional<Usuario> getAllById(Long id);
}
