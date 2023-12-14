package com.sweettentation9.service;

import com.sweettentation9.entity.Categoria;
import com.sweettentation9.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> obtenerTodosProductos();
    Optional<Producto> obtenerProductoPorId(Long id);
    List<Producto> obtenerProductosPorNombre(String nombre);
    List<Producto> obtenerProductosPorCategoria(Categoria categoria);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Long id);
}
