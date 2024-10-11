package com.btg.controllers;

import com.btg.models.Fondo;
import com.btg.services.FondoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fondos")
public class FondoController {

    @Autowired
    private FondoService fondoService;

    // Método para listar todos los fondos
    @GetMapping
    public List<Fondo> listarFondos() {
        return fondoService.listarFondos();
    }

    // Método para obtener un fondo por su ID
    @GetMapping("/{id}")
    public Fondo obtenerFondoPorId(@PathVariable Long id) {
        return fondoService.obtenerFondoPorId(id);
    }

    // Método para crear un nuevo fondo
    @PostMapping
    public Fondo crearFondo(@RequestBody Fondo fondo) {
        return fondoService.crearFondo(fondo);
    }

    // Método para eliminar un fondo por su ID
    @DeleteMapping("/{id}")
    public void eliminarFondo(@PathVariable Long id) {
        fondoService.eliminarFondo(id);
    }

    // Método para buscar fondos por nombre
    @GetMapping("/buscar")
    public List<Fondo> buscarFondosPorNombre(@RequestParam String nombre) {
        return fondoService.buscarFondosPorNombre(nombre);
    }

    
}
