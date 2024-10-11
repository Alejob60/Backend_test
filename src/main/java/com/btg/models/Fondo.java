package com.btg.models;

import javax.persistence.*;

@Entity
public class Fondo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int montoMinimo;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(int montoMinimo) {
        this.montoMinimo = montoMinimo;
    }
}
