/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author vbenitez
 */
public class ArreglosService {
    
    
    public static double [] inicializarA (double [] arregloA) {
        
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] =  Math.round(Math.random()*50);
        }
        
        
    return arregloA;
    
    }
    
    public static void mostrarArreglo (double [] arregloA) {
    
        System.out.println(Arrays.toString(arregloA));
    }
    
    public static void ordenarArreglo (double [] arregloA){
        Arrays.sort(arregloA);
        
        double [] arrayOut = new double [50];
        
        for (int i = 0; i < arregloA.length; i++) {
            
           arrayOut[i] = arregloA[50-1-i];
          
          
        }
        
         mostrarArreglo(arrayOut);
    }
 public static void inicializarB (double [] arregloA, double [] arregloB) {
        
     System.arraycopy(arregloA, 0, arregloB, 0, 10);
     
     Arrays.fill(arregloB, 10, 20,0.5);
       
     mostrarArreglo (arregloB);
     }
        
    
} //endservice
