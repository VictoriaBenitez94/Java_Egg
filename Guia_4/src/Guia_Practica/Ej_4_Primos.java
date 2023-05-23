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
public class Ej_4_Primos {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        boolean pri;
        System.out.println("ingrese el valor a verificar");
        x=sc.nextInt();
        pri=primos(x);
        System.out.println("el numero es primo? "+pri);
    }
    
    public static boolean primos(int x){
        int c=0;
        for (int i = 1; i <= x; i++) {
            if(x%i==0){
                c++;
            }
        }
        return c==2;
    }
}
