package com.sweettentation9.service.implementation;

import com.sweettentation9.entity.RegistroUsuario;
import com.sweettentation9.repository.RegistroUsuarioRepository;
import com.sweettentation9.service.RegistroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroUsuarioServiceImp implements RegistroUsuarioService {
    private RegistroUsuarioRepository registroUsuarioRepository;

    @Autowired
    public void RegistroUsuarioServiceImpl(RegistroUsuarioRepository registroUsuarioRepository) {
        this.registroUsuarioRepository = registroUsuarioRepository;
    }

    public RegistroUsuarioServiceImp(RegistroUsuarioRepository registroUsuarioRepository) {
        this.registroUsuarioRepository = registroUsuarioRepository;
    }

    @Override
    public List<RegistroUsuario> obtenerTodosUsuarios() {
        return registroUsuarioRepository.findAll();
    }

    @Override
    public Optional<RegistroUsuario> obtenerUsuarioPorId(Long id) {
        return registroUsuarioRepository.findById(id);
    }

    @Override
    public Optional<RegistroUsuario> obtenerUsuarioPorUserName(String userName) {
        return registroUsuarioRepository.findByUserName(userName);
    }

    @Override
    public RegistroUsuario guardarUsuario(RegistroUsuario usuario) {
        return registroUsuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        registroUsuarioRepository.deleteById(id);
    }
}
