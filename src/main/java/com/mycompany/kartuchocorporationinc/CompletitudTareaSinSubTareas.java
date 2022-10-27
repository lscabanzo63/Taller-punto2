/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kartuchocorporationinc;

import java.util.LinkedList;

/**
 *
 * @author santi
 */
public class CompletitudTareaSinSubTareas implements Completitud {

    @Override
    public double calcularCompletitud(LinkedList<Tarea> tareas) {
        return 0.2;
    }
    
}
