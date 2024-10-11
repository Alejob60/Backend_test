package com.btg.services;

import com.btg.models.Fondo;
import com.btg.repositories.FondoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FondoService {

    @Autowired
    private FondoRepository fondoRepository;

    public List<Fondo> listarFondos() {
        return fondoRepository.findAll();
    }

    public Fondo obtenerFondoPorId(Long id) {
        return fondoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Fondo no encontrado"));
    }

    public Fondo crearFondo(Fondo fondo) {
        return fondoRepository.save(fondo);
    }

    public void eliminarFondo(Long id) {
        Fondo fondo = obtenerFondoPorId(id);
        fondoRepository.delete(fondo);
    }
    public List<Fondo> buscarFondosPorNombre(String nombre) {
        return fondoRepository.findByNombre(nombre);
    }
}
