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
public class CelciusaFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura");
        
        int temp = leer.nextInt();
        
        int far = 32 + (9 * temp / 5);
        
        System.out.println("Fahrenheit: " + far );
        
        leer.close();
    }
    
}
