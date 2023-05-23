/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Trabajo;

import java.util.Scanner;

/**
 *
 * @author benit
 */
public class Ej_12EsMultiplo {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       int x1;
       int x2;
        System.out.print("Cargue los 2 numeros: ");
        x1=sc.nextInt();
        x2=sc.nextInt();
        multiplo(x1,x2);
    }
    public static void multiplo(int x1, int x2){
        if(x1%x2==0){
            System.out.println("El numero x1 es multiplo de x2 : ");
        }else {
            System.out.println("x1 no es multiplo de x2 ");
        }
    }
    
}


