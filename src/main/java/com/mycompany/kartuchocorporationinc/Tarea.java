/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;



/**
 *
 * @author santi
 */
public class Tarea {
    private SubTarea [] subTareas;
    private String nombre;
    private int complejidad; 
    private int tiempo;
    private String tipoImpuesto; 
    

    public Tarea(String nombre, int complejidad, int tiempo, String tipoImpuesto) {
        this.nombre = nombre;
        this.complejidad = complejidad;
        this.tiempo = tiempo;
        this.tipoImpuesto = tipoImpuesto;
    }
    
    public double calcularValor(ValorTarea valorTarea){
        return  0.2;
    }
    public double calcularCompletitud(Completitud completitud){
        return 0.2;
    }
     public double calcularCostoImpositivo(CostoImpositivo costoimpositivo){
        return 0.2; 
    }
    public double calcularAtraso(Atraso atraso){
        return atraso.calcularAtraso(tiempo);
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

    /**
     * @return the tipoImpuesto
     */
    public String getTipoImpuesto() {
        return tipoImpuesto;
    }

    /**
     * @param tipoImpuesto the tipoImpuesto to set
     */
    public void setTipoImpuesto(String tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }

    /**
     * @return the subTareas
     */
    public SubTarea[] getSubTareas() {
        return subTareas;
    }

    /**
     * @param subTareas the subTareas to set
     */
    public void setSubTareas(SubTarea[] subTareas) {
        this.subTareas = subTareas;
    }
    
}
