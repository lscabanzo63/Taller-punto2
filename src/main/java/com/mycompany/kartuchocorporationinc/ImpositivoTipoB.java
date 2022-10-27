/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class ImpositivoTipoB implements CostoImpositivo {
    private double porcentajeB=0.05;
    @Override
    public double calcularCostoImpositivo(double valor) {
        double costo;
        costo=valor*porcentajeB;
        return costo;
    }

    /**
     * @return the porcentajeB
     */
    public double getPorcentajeB() {
        return porcentajeB;
    }

    /**
     * @param porcentajeB the porcentajeB to set
     */
    public void setPorcentajeB(double porcentajeB) {
        this.porcentajeB = porcentajeB;
    }
    
    
}
