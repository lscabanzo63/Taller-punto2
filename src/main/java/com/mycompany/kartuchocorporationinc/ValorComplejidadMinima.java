/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

/**
 *
 * @author santi
 */
public class ValorComplejidadMinima implements ValorTarea{
    private int valMinima=25;

    @Override
    public double calcularValor(int tiempo) {
        double valor;
        valor=tiempo*valMinima;
        return valor; 
    }

    /**
     * @return the valMinima
     */
    public int getValMinima() {
        return valMinima;
    }

    /**
     * @param valMinima the valMinima to set
     */
    public void setValMinima(int valMinima) {
        this.valMinima = valMinima;
    }
    
    
}
