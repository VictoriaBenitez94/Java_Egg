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
public class Ej_7_Guia3_ExtrasMaxMin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int i = 0;
        double max = 0;
        double min = 0;
        double j = 0;
        double num;
        do {
            System.out.println("Ingrese los numeros");
            i++;
            num = leer.nextDouble();
            if (i == 1) {
                max = num;
                min = num;
            } else {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                }
                j = j + num;
           } while (i < n);
            System.out.println("El numero maximo ingresado es " + max);
            System.out.println("El numero minimo ingresado es " + min);
            System.out.println("El promedio de los numeros ingresados es " + j / n);
    }
}
        
    
    

