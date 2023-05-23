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
public class Ej_6_GuiaTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese un numero:");
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Los numeros son mayores a 25");
        
       } else if (num1 >  25 || num2 > 25) {
            System.out.println("Al menos un numero es mayor a 25");
            
       } else {
            System.out.println("Ningun numero es mayor a 25");}
        
        } 
   
    }
