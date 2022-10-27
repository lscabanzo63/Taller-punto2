/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class AtrasoComplejidadMaxima implements Atraso {
    private double porcentajeAtrasoMaxima=0.20;
    private int  atraspMaxima=8;

    @Override
    public double calcularAtraso(int tiempo) {
        double atraso;
        atraso=(tiempo*porcentajeAtrasoMaxima)+8;
        return atraso;
    }

    /**
     * @return the porcentajeAtrasoMaxima
     */
    public double getPorcentajeAtrasoMaxima() {
        return porcentajeAtrasoMaxima;
    }

    /**
     * @param porcentajeAtrasoMaxima the porcentajeAtrasoMaxima to set
     */
    public void setPorcentajeAtrasoMaxima(double porcentajeAtrasoMaxima) {
        this.porcentajeAtrasoMaxima = porcentajeAtrasoMaxima;
    }

    /**
     * @return the atraspMaxima
     */
    public int getAtraspMaxima() {
        return atraspMaxima;
    }

    /**
     * @param atraspMaxima the atraspMaxima to set
     */
    public void setAtraspMaxima(int atraspMaxima) {
        this.atraspMaxima = atraspMaxima;
    }
    
    
}
