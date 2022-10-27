/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class AtrasoComplejidadMedia implements Atraso {
    private double porcentajeAtrasoMedia=0.10;
    @Override
    public double calcularAtraso(int tiempo) {
     double atraso;
     atraso=tiempo*porcentajeAtrasoMedia;
     return atraso;
    }
    /**
     * @return the porcentajeAtrasoMedia
     */
    public double getPorcentajeAtrasoMedia() {
        return porcentajeAtrasoMedia;
    }

    /**
     * @param porcentajeAtrasoMedia the porcentajeAtrasoMedia to set
     */
    public void setPorcentajeAtrasoMedia(double porcentajeAtrasoMedia) {
        this.porcentajeAtrasoMedia = porcentajeAtrasoMedia;
    }
    
}
