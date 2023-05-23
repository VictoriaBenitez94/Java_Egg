/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author benit
 */
public class NombreEnPantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Ingrese su nombre");
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        
        System.out.println("Su nombre es: " + nombre);
        
        leer.close();
        
        
        
        
        
        
    }
    
}
