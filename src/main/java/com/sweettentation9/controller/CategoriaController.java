package com.sweettentation9.controller;

import com.sweettentation9.entity.Categoria;
import com.sweettentation9.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> obtenerTodasCategorias() {
        List<Categoria> categorias = categoriaService.obtenerTodasCategorias();
        return ResponseEntity.ok(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> obtenerCategoriaPorId(@PathVariable Long id) {
        return categoriaService.obtenerCategoriaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Categoria> obtenerCategoriaPorNombre(@PathVariable String nombre) {
        return categoriaService.obtenerCategoriaPorNombre(nombre)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Categoria>> obtenerCategoriasPorTipo(@PathVariable String tipo) {
        List<Categoria> categorias = categoriaService.obtenerCategoriasPorTipo(tipo);
        return ResponseEntity.ok(categorias);
    }

    @PostMapping
    public ResponseEntity<Categoria> guardarCategoria(@RequestBody Categoria categoria) {
        Categoria nuevaCategoria = categoriaService.guardarCategoria(categoria);
        return ResponseEntity.ok(nuevaCategoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCategoria(@PathVariable Long id) {
        categoriaService.eliminarCategoria(id);
        return ResponseEntity.noContent().build();
    }
}
