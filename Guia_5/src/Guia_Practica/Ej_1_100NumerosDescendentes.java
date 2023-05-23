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
public class Ej_1_100NumerosDescendentes {

    /**
     * @param args the command line arguments
     */
    /**
     * Realizar un algoritmo que llene un vector con los 100 primeros números
     * enteros y los muestre por pantalla en orden descendente.

     */
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {

            num[i] = i + 1;

        }

        for (int j = num.length - 1; j >= 0; j--) {

            System.out.println(num[j]);

        }
    }
}


