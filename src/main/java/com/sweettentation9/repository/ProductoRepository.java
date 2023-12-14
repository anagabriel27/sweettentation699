package com.sweettentation9.repository;

import com.sweettentation9.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository <Producto, Long> {

    @Override
    Optional<Producto> findById(Long id);

    Optional<Producto> findByNombre(String nombre);
}
