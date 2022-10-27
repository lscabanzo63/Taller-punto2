/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class ValorComplejidadMedia implements ValorTarea {
    private int valMedia=25;
    private double valPorcentaje=0.05;
    @Override
    public double calcularValor(int tiempo) {
        double valor;
        double aux;
        valor=tiempo*valMedia;
        aux=valor*valPorcentaje;
        valor=valor + aux;
        return valor;
    }

    /**
     * @return the valMedia
     */
    public int getValMedia() {
        return valMedia;
    }

    /**
     * @param valMedia the valMedia to set
     */
    public void setValMedia(int valMedia) {
        this.valMedia = valMedia;
    }

    /**
     * @return the valPorcentaje
     */
    public double getValPorcentaje() {
        return valPorcentaje;
    }

    /**
     * @param valPorcentaje the valPorcentaje to set
     */
    public void setValPorcentaje(double valPorcentaje) {
        this.valPorcentaje = valPorcentaje;
    }
    
    
}
