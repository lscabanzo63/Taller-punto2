/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class ValorComplejidadMaxima implements ValorTarea {
    private int valAlta=25;
    private int valDiaDemas=10;
    private double valPorcentaje=0.07;
    
    
    
    @Override
    public double calcularValor(int tiempo) {
        double valor = 0;
        double aux; 
        int extra;
        int tiempo2;
        if (tiempo<=10) {
            valor=tiempo*valAlta;
            aux=valor*valPorcentaje;
            valor= valor+aux;
        }
        if (tiempo>=10) {
            tiempo2=tiempo-10;
            extra=tiempo2*10;
            valor=tiempo*valAlta;
            aux=valor*valPorcentaje;
            valor= valor+aux+extra;
        }
        return valor;
    }

    /**
     * @return the valAlta
     */
    public int getValAlta() {
        return valAlta;
    }

    /**
     * @param valAlta the valAlta to set
     */
    public void setValAlta(int valAlta) {
        this.valAlta = valAlta;
    }

    /**
     * @return the valDiaDemas
     */
    public int getValDiaDemas() {
        return valDiaDemas;
    }

    /**
     * @param valDiaDemas the valDiaDemas to set
     */
    public void setValDiaDemas(int valDiaDemas) {
        this.valDiaDemas = valDiaDemas;
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
