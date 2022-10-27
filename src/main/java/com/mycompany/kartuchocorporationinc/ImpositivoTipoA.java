/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class ImpositivoTipoA implements CostoImpositivo {
    private double porcentajeA=0.03;
    @Override
    public double calcularCostoImpositivo(double valor) {
        double costo;
        costo=valor*getPorcentajeA();
        return costo;
    }

    /**
     * @return the porcentajeA
     */
    public double getPorcentajeA() {
        return porcentajeA;
    }

    /**
     * @param porcentajeA the porcentajeA to set
     */
    public void setPorcentajeA(double porcentajeA) {
        this.porcentajeA = porcentajeA;
    }
    
}
