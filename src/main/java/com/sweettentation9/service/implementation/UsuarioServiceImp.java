package com.sweettentation9.service.implementation;

import com.sweettentation9.entity.Usuario;
import com.sweettentation9.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImp implements UsuarioService {
    @Override
    public List<Usuario> obtenerTodosUsuarios() {
        return null;
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorNombre(String nombre) {
        return Optional.empty();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {

    }
}
