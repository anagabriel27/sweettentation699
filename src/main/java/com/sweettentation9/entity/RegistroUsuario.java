package com.sweettentation9.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class RegistroUsuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long Id;

        private String Nombre;

        private String Email;

        private String Direccion;

        private Long Telefono;

        private String Password;

        private String UserName;
        private Date FechaCreacion;



}
