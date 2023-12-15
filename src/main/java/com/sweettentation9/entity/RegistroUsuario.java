package com.sweettentation9.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
public class RegistroUsuario {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String nombre;

        private String email;

        private String direccion;

        private Long telefono;

        private String password;

        private String userName;
        @Temporal(TemporalType.TIMESTAMP)
        private Date fechaCreacion;

        @PrePersist
        protected void onCreate() {
                fechaCreacion = new Date();
        }

        public RegistroUsuario() {
        }

        public RegistroUsuario(Long id, String nombre, String email, String direccion, Long telefono, String password, String userName, Date fechaCreacion) {
                this.id = id;
                this.nombre = nombre;
                this.email = email;
                this.direccion = direccion;
                this.telefono = telefono;
                this.password = password;
                this.userName = userName;
                this.fechaCreacion = new Date();
        }

        public RegistroUsuario( String nombre, String email, String direccion, Long telefono, String password, String userName) {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getDireccion() {
                return direccion;
        }

        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }

        public Long getTelefono() {
                return telefono;
        }

        public void setTelefono(Long telefono) {
                this.telefono = telefono;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public Date getFechaCreacion() {
                return fechaCreacion;
        }

        public void setFechaCreacion(Date fechaCreacion) {
                this.fechaCreacion = fechaCreacion;
        }
}