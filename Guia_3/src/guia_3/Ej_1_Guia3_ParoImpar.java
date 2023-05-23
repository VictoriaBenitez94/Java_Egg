/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

import java.util.Scanner;

/**
 *
 * @author benit
 */


//Crear un programa que dado un número determine si es par o impar.


public class Ej_1_Guia3_ParoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
               
         
        System.out.println("Ingrese un numero"); 
        
        int numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            
            System.out.println("El numero es par");
            
        }else {
            
            System.out.println("El numero es impar");
        }
          
          
    }
    
}
