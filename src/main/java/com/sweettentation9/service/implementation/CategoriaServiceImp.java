package com.sweettentation9.service.implementation;

import com.sweettentation9.entity.Categoria;
import com.sweettentation9.repository.CategoriaRepository;
import com.sweettentation9.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoriaServiceImp implements CategoriaService {

    @Override
    public List<Categoria> obtenerTodasCategorias() {
        return null;
    }

    @Override
    public Optional<Categoria> obtenerCategoriaPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Categoria> obtenerCategoriaPorNombre(String nombre) {
        return Optional.empty();
    }

    @Override
    public List<Categoria> obtenerCategoriasPorTipo(String tipo) {
        return null;
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return null;
    }

    @Override
    public void eliminarCategoria(Long id) {

    }
}
