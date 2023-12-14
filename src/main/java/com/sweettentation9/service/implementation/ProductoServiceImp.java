package com.sweettentation9.service.implementation;

import com.sweettentation9.entity.Categoria;
import com.sweettentation9.entity.Producto;
import com.sweettentation9.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoServiceImp implements ProductoService {
    @Override
    public List<Producto> obtenerTodosProductos() {
        return null;
    }

    @Override
    public Optional<Producto> obtenerProductoPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Producto> obtenerProductosPorNombre(String nombre) {
        return null;
    }

    @Override
    public List<Producto> obtenerProductosPorCategoria(Categoria categoria) {
        return null;
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return null;
    }

    @Override
    public void eliminarProducto(Long id) {

    }
}
