package com.sweettentation9.controller;

import com.sweettentation9.entity.RegistroUsuario;
import com.sweettentation9.service.RegistroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
@Controller
public class LoginController {

    private final RegistroUsuarioService registroUsuarioService;

    @Autowired
    public LoginController(RegistroUsuarioService registroUsuarioService) {
        this.registroUsuarioService = registroUsuarioService;
    }

    @GetMapping("/Login")
    public String showLoginPage() {
        return "Login";
    }

    @PostMapping("/LoginUsuario")
    public String login(@RequestParam String username, @RequestParam String password) {
        Optional<RegistroUsuario> usuarioOptional = registroUsuarioService.obtenerUsuarioPorUserName(username);

        if (usuarioOptional.isPresent() && usuarioOptional.get().getPassword().equals(password)) {
            // Usuario autenticado correctamente
            return "redirect:/Registro"; // Cambia "/Inicio" por la página a la que debe redirigir después del inicio de sesión exitoso
        } else {

            return "Login";
        }
    }
}
