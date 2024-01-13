package com.sweettentation9.service;

import com.sweettentation9.entity.RegistroUsuario;

import java.util.List;
import java.util.Optional;

public interface RegistroUsuarioService {

    List<RegistroUsuario> obtenerTodosUsuarios();
    Optional<RegistroUsuario> obtenerUsuarioPorId(Long id);
    Optional<RegistroUsuario> obtenerUsuarioPorUserName(String userName);
    RegistroUsuario guardarUsuario(RegistroUsuario usuario);

    void eliminarUsuario(Long id);
}
