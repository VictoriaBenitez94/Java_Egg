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
public class Ej_2_NumeroRepetido {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int vector[]=new int[10];
       
        for (int i = 0; i < 10; i++) {
            vector[i]= (int) (Math.random()*5);
        }
        System.out.println("Ingrese un numero a buscar: ");
        int num=leer.nextInt();
        String vec="";
        for (int elem:vector) {
            if (num==elem) {
               vec += "("+elem+")"+", ";
            }else{
                vec+= elem + ", "; 
            }  
            
        }
        System.out.println(vec);
        int k=0;
        for (int i = 0; i < 10; i++) {   
            if (num==vector[i]&&k==0) {
                System.out.print("El numero se encuentra en el sub-indice: "+ i);
                k++;
            }else if(num==vector[i]&&k!=0){
                 System.out.print(", "+i);
                 k++;
                    }

        }
        System.out.println("");
        System.out.println("Se encontro: "+ k +" veces");
    }
    
}
