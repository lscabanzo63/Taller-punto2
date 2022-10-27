/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class SubTarea {
    private String nombre;
    private int complejidad; 
    private int tiempo;

    public SubTarea(String nombre, int complejidad, int tiempo) {
        this.nombre = nombre;
        this.complejidad = complejidad;
        this.tiempo = tiempo;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the complejidad
     */
    public int getComplejidad() {
        return complejidad;
    }

    /**
     * @param complejidad the complejidad to set
     */
    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
