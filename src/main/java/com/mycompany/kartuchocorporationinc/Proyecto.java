/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;



/**
 *
 * @author santi
 */
public class Proyecto {
    private Tarea tareas [];
    private String nombre; 
    private String objetivo;
    private String alcance;
    

    public Proyecto(String nombre, String objetivo, String alcance) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.alcance = alcance;
        
        
    }
    public Proyecto(){
        tareas= new Tarea[2];
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
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the alcance
     */
    public String getAlcance() {
        return alcance;
    }

    /**
     * @param alcance the alcance to set
     */
    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    
}
