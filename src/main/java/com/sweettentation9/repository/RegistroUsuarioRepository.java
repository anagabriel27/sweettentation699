package com.sweettentation9.repository;

import com.sweettentation9.entity.RegistroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistroUsuarioRepository extends JpaRepository <RegistroUsuario,Long> {

    Optional<RegistroUsuario> findByUserName(String userName);

    Optional<RegistroUsuario> getAllById(Long id);

}
