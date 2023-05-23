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
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ 
se sale del programa, caso contrario se vuelve a mostrar el menú.
*/

public class Ej_6_Guia3_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        int num2;
        
        int opcion;
        
        String sn = "n";
        
        
        
        System.out.println("Ingrese los numeros para las operaciones");
        
        num = leer.nextInt();
        
        num2 = leer.nextInt();
        
       do {
        System.out.println("1.SUMA");
        System.out.println("2.RESTA");
        System.out.println("3.MULTIPLICACION");
        System.out.println("4.DIVISION");
        System.out.println("5.SALIR");
        System.out.println("ELIJA OPCION");
        
        opcion = leer.nextInt();
        
        
        switch (opcion) {
            
            case 1:
                
                System.out.println("La suma es: " + (num + num2));
               
                continue;
            
            case 2:
                
                System.out.println("La resta es: " + (num - num2));
                
                continue;
                
            case 3:
                
                System.out.println("La multiplicacion es: " + (num * num2));
                
                continue;
                
            case 4:
                
                System.out.println("La division es:" + (num / num2));
                
                continue;
                
            case 5:
                
                System.out.println("¿Estás seguro que deseas salir del programa? (S/N)");
                sn = leer.next();
                
                continue;
                
            default:
                
                System.out.println("Ingrese una opción válida");
                
               
        }
         
       }while (!sn.equals("s"));
        
       
        
    }
    
}
