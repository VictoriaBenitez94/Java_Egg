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
public class Ej_8_GuiaTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota:");
        
        int num1 = leer.nextInt();
        
        while (num1 > 10 || num1 < 0){
        
            System.out.println("La nota no está no en el rango, ingrese nuevamente la nota");
        
            num1=leer.nextInt();
        }
        
        
      
        
        
    }
    
}
