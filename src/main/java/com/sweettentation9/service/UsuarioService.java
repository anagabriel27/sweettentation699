package com.sweettentation9.service;

import com.sweettentation9.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> obtenerTodosUsuarios();
    Optional<Usuario> obtenerUsuarioPorId(Long id);
    Optional<Usuario> obtenerUsuarioPorNombre(String nombre);
    Usuario guardarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}
