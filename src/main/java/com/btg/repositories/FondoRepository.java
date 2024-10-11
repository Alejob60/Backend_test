package com.btg.repositories;

import com.btg.models.Fondo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FondoRepository extends JpaRepository<Fondo, Long> {
    // Aquí puedes definir consultas personalizadas si es necesario
    List<Fondo> findByNombre(String nombre);
}