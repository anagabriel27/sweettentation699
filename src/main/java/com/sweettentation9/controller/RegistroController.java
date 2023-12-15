package com.sweettentation9.controller;

import com.sweettentation9.dto.RegistroUsuarioDTO;
import com.sweettentation9.entity.RegistroUsuario;
import com.sweettentation9.service.RegistroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistroController {

    private final RegistroUsuarioService registroUsuarioService;

    @Autowired
    public RegistroController(RegistroUsuarioService registroUsuarioService) {
        this.registroUsuarioService = registroUsuarioService;
    }

    @GetMapping("/Registro")
    public String showRegistroPage() {
        return "Registro";
    }

    @PostMapping("/Registro")
    public ResponseEntity<Object> registrarUsuario(@ModelAttribute RegistroUsuarioDTO registroUsuarioDTO) {
        try {
            RegistroUsuario nuevoUsuario = convertirDtoARegistroUsuario(registroUsuarioDTO);
            RegistroUsuario usuarioGuardado = registroUsuarioService.guardarUsuario(nuevoUsuario);

            if (usuarioGuardado != null) {

                System.out.println("Usuario registrado correctamente: " + usuarioGuardado);
                return ResponseEntity.status(HttpStatus.CREATED).body("Usuario registrado correctamente");
            } else {

                System.out.println("Error al registrar usuario.");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al registrar usuario.");
            }
        } catch (Exception e) {

            System.out.println("Error en el controlador: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno del servidor");
        }
    }

    private RegistroUsuario convertirDtoARegistroUsuario(RegistroUsuarioDTO registroUsuarioDTO) {
        RegistroUsuario registroUsuario = new RegistroUsuario();
        registroUsuario.setNombre(registroUsuarioDTO.getNombre());
        registroUsuario.setEmail(registroUsuarioDTO.getEmail());
        registroUsuario.setDireccion(registroUsuarioDTO.getDireccion());
        registroUsuario.setTelefono(registroUsuarioDTO.getTelefono());
        registroUsuario.setPassword(registroUsuarioDTO.getPassword());
        registroUsuario.setUserName(registroUsuarioDTO.getUserName());

        return registroUsuario;
    }
}
