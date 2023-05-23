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

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario 
hasta que la suma de los números introducidos supere el límite inicial.
*/

public class Ej_5_Guia3_SumaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        
        int limite;
        
        int suma = 0;
        
        System.out.println("Ingrese un numero limite");
        
        limite = leer.nextInt();
        
        
        do {
            System.out.println("Ingrese un numero");
            
            num = leer.nextInt();
            
            suma += num;
            
        } while (suma <= limite);
        
        
        
    }
    
}
