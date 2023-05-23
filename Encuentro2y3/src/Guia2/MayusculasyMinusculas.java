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
public class MayusculasyMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        
        String frase;
        frase = leer.nextLine();
        
        System.out.println(frase.toLowerCase());
        
        System.out.println(frase.toUpperCase());
        
        leer.close();
    }
    
}
