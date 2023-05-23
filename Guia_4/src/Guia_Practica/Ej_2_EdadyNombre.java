/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Practica;

import java.util.Scanner;

/**
 *
 * @author benit
 */
public class Ej_2_EdadyNombre {

    /**
     * @param args the command line arguments
     */
    
    /*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las 
    personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona,
    el programa debe preguntarle al usuario 
    si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    */
    
    
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      int edad;
      String validacion;
      int c=1;
      String nombre;
      do {
          System.out.println("cargue el nombre de la persona "+c);
          nombre=sc.next();
          System.out.println("cargue la edad de la persona "+c);
          edad=sc.nextInt();
          mayorEdad(nombre, edad);
          System.out.println("desea cargar mas personas?  S/N");
          validacion= sc.next();
          c++;
      }while(validacion.equalsIgnoreCase("s"));
    }
    public static void mayorEdad(String nombre, int edad){
        if (edad>17){
            System.out.println(nombre+" tiene "+edad+" es mayor de edad ");
        }else {
            System.out.println(nombre+" tiene "+edad+" no es mayor de edad ");
        }
    }
}
