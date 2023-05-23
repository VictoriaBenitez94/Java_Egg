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
public class DobleTripleyRaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un nuemro: ");
        int num1 = leer.nextInt();
        
        int doble = num1 * 2;
        int triple = num1 * 3;
        
        double num2;
        num2 = num1;
        
        double raiz = Math.sqrt(num2);
        
        System.out.println("Su doble es: " + doble);
        System.out.println("Su triple es: " + triple);
        System.out.println("Su raiz es: " + raiz);
        
        leer.close();
        
    }
    
}
