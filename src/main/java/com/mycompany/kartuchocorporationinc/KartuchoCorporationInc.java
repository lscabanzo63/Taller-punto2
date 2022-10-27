/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kartuchocorporationinc;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class KartuchoCorporationInc {

    public static void main(String[] args) {
        double acumuladoValorProyecto1=0;
        double acumuladoImpositivo1=0;
        double cajaValorImpositivo1=0;
        double cajaValorProyecto1=0;
        
        double acumuladoValorProyecto2=0;
        double acumuladoImpositivo2=0;
        double cajaValorImpositivo2=0;
        double cajaValorProyecto2=0;
        
        double acumuladoValorProyecto3=0;
        double acumuladoImpositivo3=0;
        double cajaValorImpositivo3=0;
        double cajaValorProyecto3=0;
        
        double acumuladoValorProyecto4=0;
        double acumuladoImpositivo4=0;
        double cajaValorImpositivo4=0;
        double cajaValorProyecto4=0;
        
        double acumuladoValorProyecto5=0;
        double acumuladoImpositivo5=0;
        double cajaValorImpositivo5=0;
        double cajaValorProyecto5=0;
        
        double acumuladoValorProyecto6=0;
        double acumuladoImpositivo6=0;
        double cajaValorImpositivo6=0;
        double cajaValorProyecto6=0;
        
        double valorFinalDelProyecto=0;
        String nombreTareaMain;
        String nombreTareaMain2;
        String complejidadTareaMain;
        int tiempoTareaMain;
        String tipoImpuestoMain;
        int cantTareas;
        int auxIniciadora=1;
        int auxDesicion=55;
        String nombreProyectoMain;
        String objetivoProyectoMain;
        String alcanceProyectoMain;
        LinkedList<Proyecto> infoProyecto= new LinkedList<>();
        LinkedList<Tarea> infoTarea= new LinkedList<>();
        LinkedList<SubTarea> infoSubTarea= new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("--BIENVENIDO A SU HERRAMIENTA DE MANEJO DE PROYECTOS--");
        System.out.println("Ingrese el nombre del proyecto");
                    nombreProyectoMain=in.nextLine();
                    System.out.println("Ingrese el objetivo del proyecto");
                    objetivoProyectoMain=in.nextLine();
                    System.out.println("Ingrese el alcance del proyecto");
                    alcanceProyectoMain=in.nextLine();
                    Proyecto proyectoN= new Proyecto(nombreProyectoMain, objetivoProyectoMain, alcanceProyectoMain);
                    infoProyecto.addLast(proyectoN);
                    System.out.println("Ingrese las tareas de su proyecto");
                    System.out.println("¿Cuantas Tareas tiene el proyecto: "+ nombreProyectoMain + "?");
                    cantTareas=in.nextInt();
                    
            
                     for (int i = 0; i < cantTareas; i++) {
                            System.out.println("Ingrese el nombre de la tarea: ");
                            nombreTareaMain=in.nextLine();
                            
                            System.out.println("Ingrese la complejidad de la tarea: "
                                              +"\n1.Minima"
                                              +"\n2.Media"
                                              +"\n3.Maxima" );
                            complejidadTareaMain=in.nextLine();
                            System.out.println("Ingrese el tiempo de la tarea");
                            tiempoTareaMain=in.nextInt();
                            System.out.println("¿Cual es el tipo de impuesto impostivo segun su reglamentacion fiscal A/B");
                            tipoImpuestoMain=in.nextLine();
                            Tarea tarea1= new Tarea(nombreTareaMain, cantTareas, i, tipoImpuestoMain);
                            infoTarea.add(tarea1);

                     }
        
        
        while(auxIniciadora!=0){
            System.out.println("""
                               
                               1.Consultar costo de una Tarea
                               2.Consultar costo total del proyecto
                               3.Consultar completitud de una Tarea
                               4.Consultar atraso una Tarea""");
           auxDesicion=in.nextInt();
            
           switch(auxDesicion){
               
               case 1:
                   System.out.println("Ingrese el nomnbre de la tarea");
                   nombreTareaMain2=in.nextLine();
                   
                   for (Tarea tarea : infoTarea) {
                       if(tarea.getNombre().equals(nombreTareaMain2)){
                         switch (tarea.getComplejidad()) {
                               case 1:
                                   ValorTarea valor1= new ValorComplejidadMinima();
                                   valor1.calcularValor(tarea.getTiempo());
                               break;
                               case 2:
                                   ValorTarea valor2= new ValorComplejidadMedia();
                                   valor2.calcularValor(tarea.getTiempo());
                               break;
                               case 3:
                                   ValorTarea valor3= new ValorComplejidadMaxima();
                                   valor3.calcularValor(tarea.getTiempo());
                                break;
                               }
                         
                         
                       }
                       else{
                           System.out.println("Tarea no encontrada");
                       }
                       
                   }
                   break;
                   
               case 2:
                   for (Tarea tareaProyecto : infoTarea) {
                       if(tareaProyecto.getComplejidad()==1 && tareaProyecto.getTipoImpuesto().equals("A")){
                           ValorTarea valorProyecto1= new ValorComplejidadMinima();
                           cajaValorProyecto1=valorProyecto1.calcularValor(tareaProyecto.getTiempo());
                           acumuladoValorProyecto1=acumuladoValorProyecto1+cajaValorProyecto1;
                           CostoImpositivo impositivoProyecto1= new ImpositivoTipoA();
                           cajaValorImpositivo1=impositivoProyecto1.calcularCostoImpositivo(cajaValorProyecto1);
                           acumuladoImpositivo1=acumuladoImpositivo1 + cajaValorImpositivo1;
                       }
                       else if (tareaProyecto.getComplejidad()==2 && tareaProyecto.getTipoImpuesto().equals("A")) {
                           ValorTarea valorProyecto2= new ValorComplejidadMedia();
                           cajaValorProyecto2=cajaValorProyecto2 + valorProyecto2.calcularValor(tareaProyecto.getTiempo());
                           acumuladoValorProyecto2=acumuladoValorProyecto2 + cajaValorProyecto2;
                           CostoImpositivo impositivoProyecto2= new ImpositivoTipoA();
                           cajaValorImpositivo2=impositivoProyecto2.calcularCostoImpositivo(cajaValorProyecto2);
                           acumuladoImpositivo2=acumuladoImpositivo2 + cajaValorImpositivo2;
                       }
                       else if(tareaProyecto.getComplejidad()==3 && tareaProyecto.getTipoImpuesto().equals("A")){
                           ValorTarea valorProyecto3= new ValorComplejidadMedia();
                           cajaValorProyecto3=cajaValorProyecto3 + valorProyecto3.calcularValor(tareaProyecto.getTiempo());
                           acumuladoValorProyecto3=acumuladoValorProyecto3 + cajaValorProyecto3;
                           CostoImpositivo impositivoProyecto3= new ImpositivoTipoA();
                           cajaValorImpositivo3=impositivoProyecto3.calcularCostoImpositivo(cajaValorProyecto3);
                           acumuladoImpositivo3=acumuladoImpositivo3 + cajaValorImpositivo3;
                       }
                       else if(tareaProyecto.getComplejidad()==1 && tareaProyecto.getTipoImpuesto().equals("B")){
                           ValorTarea valorProyecto4= new ValorComplejidadMinima();
                           cajaValorProyecto4=valorProyecto4.calcularValor(tareaProyecto.getTiempo());
                           acumuladoValorProyecto4=acumuladoValorProyecto4+cajaValorProyecto4;
                           CostoImpositivo impositivoProyecto4= new ImpositivoTipoB();
                           cajaValorImpositivo4=impositivoProyecto4.calcularCostoImpositivo(cajaValorProyecto4);
                           acumuladoImpositivo4=acumuladoImpositivo4 + cajaValorImpositivo4;
                       }
                       else if(tareaProyecto.getComplejidad()==2 && tareaProyecto.getTipoImpuesto().equals("B")){
                           ValorTarea valorProyecto5= new ValorComplejidadMinima();
                           cajaValorProyecto5=valorProyecto5.calcularValor(tareaProyecto.getTiempo());
                           acumuladoValorProyecto5=acumuladoValorProyecto5+cajaValorProyecto5;
                           CostoImpositivo impositivoProyecto5= new ImpositivoTipoB();
                           cajaValorImpositivo5=impositivoProyecto5.calcularCostoImpositivo(cajaValorProyecto5);
                           acumuladoImpositivo5=acumuladoImpositivo5 + cajaValorImpositivo5;
                       }
                        else if(tareaProyecto.getComplejidad()==3 && tareaProyecto.getTipoImpuesto().equals("B")){
                           ValorTarea valorProyecto6= new ValorComplejidadMinima();
                           cajaValorProyecto6=valorProyecto6.calcularValor(tareaProyecto.getTiempo());
                           acumuladoValorProyecto6=acumuladoValorProyecto6+cajaValorProyecto6;
                           CostoImpositivo impositivoProyecto6= new ImpositivoTipoB();
                           cajaValorImpositivo6=impositivoProyecto6.calcularCostoImpositivo(cajaValorProyecto1);
                           acumuladoImpositivo6=acumuladoImpositivo6 + cajaValorImpositivo6;
                       }
                        
                   }
                   valorFinalDelProyecto=acumuladoValorProyecto1+acumuladoImpositivo1+acumuladoValorProyecto2+acumuladoImpositivo2+acumuladoValorProyecto3+acumuladoImpositivo3 + acumuladoValorProyecto4+acumuladoImpositivo4+ acumuladoValorProyecto5+acumuladoImpositivo5+ acumuladoValorProyecto6+acumuladoImpositivo6;
                   System.out.println("EL VALOR DEL PROYECTO ES: " + valorFinalDelProyecto);
                   break;
               case 3:
                   break;
           }
                    
        
    }
}
    }

