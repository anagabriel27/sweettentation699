package com.sweettentation9.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Categoria {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private String Nombre;
    private String Tipo;

    public Categoria(Long id, String nombre, String tipo) {
        Id = id;
        Nombre = nombre;
        Tipo = tipo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
