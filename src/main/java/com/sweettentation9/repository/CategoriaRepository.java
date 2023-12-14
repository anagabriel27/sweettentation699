package com.sweettentation9.repository;

import com.sweettentation9.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

    @Override
    Optional<Categoria> findById(Long id);
    Optional<Categoria> findByNombre(String nombre);

    Optional<Categoria> findByTipo(String tipo);

}
