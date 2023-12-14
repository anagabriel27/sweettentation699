package com.sweettentation9.service;

import com.sweettentation9.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    List<Categoria> obtenerTodasCategorias();
    Optional<Categoria> obtenerCategoriaPorId(Long id);
    Optional<Categoria> obtenerCategoriaPorNombre(String nombre);
    List<Categoria> obtenerCategoriasPorTipo(String tipo);
    Categoria guardarCategoria(Categoria categoria);
    void eliminarCategoria(Long id);
}
