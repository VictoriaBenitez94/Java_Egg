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
public class Ej_3_Guia3_ExtrasVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
        trata de una vocal. Caso contrario mostrar un mensaje. Nota: 
        investigar la función equals() de la clase String
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
           
            System.out.println("La letra es vocal");
            
        }else 
            
            System.out.println("La letra no es una vocal");
        
    }
    
}
