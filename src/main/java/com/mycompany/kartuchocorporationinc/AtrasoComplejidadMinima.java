/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class AtrasoComplejidadMinima implements Atraso {
    private double complejidadMinima=5.0;
    @Override
    public double calcularAtraso(int tiempo) {
        return getComplejidadMinima();
    }

    /**
     * @return the complejidadMinima
     */
    public double getComplejidadMinima() {
        return complejidadMinima;
    }

    /**
     * @param complejidadMinima the complejidadMinima to set
     */
    public void setComplejidadMinima(double complejidadMinima) {
        this.complejidadMinima = complejidadMinima;
    }

    /**
     * @return the complejididadMinima
     */

    
}
