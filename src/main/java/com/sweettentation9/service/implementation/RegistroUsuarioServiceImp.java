package com.sweettentation9.service.implementation;

import com.sweettentation9.entity.RegistroUsuario;
import com.sweettentation9.service.RegistroUsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroUsuarioServiceImp implements RegistroUsuarioService {

    @Override
    public List<RegistroUsuario> obtenerTodosUsuarios() {
        return null;
    }

    @Override
    public Optional<RegistroUsuario> obtenerUsuarioPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<RegistroUsuario> obtenerUsuarioPorUserName(String userName) {
        return Optional.empty();
    }

    @Override
    public RegistroUsuario guardarUsuario(RegistroUsuario usuario) {
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {

    }
}
