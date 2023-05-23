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
public class Ej_6_CuadradoMagico3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[][] matriz = new int[3][3];

        // Pedir al usuario que introduzca los números
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los números del cuadrado mágico (del 1 al 9):");

        // Leer los números y comprobar que son válidos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numero = scanner.nextInt();
                if (numero < 1 || numero > 9) {
                    System.out.println("Número no válido, debe estar entre 1 y 9.");
                    return;
                }
                matriz[i][j] = numero;
            }
        }

        // Comprobar si es un cuadrado mágico
        int sumaFila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        int sumaFila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        int sumaFila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        int sumaColumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        int sumaColumna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        int sumaColumna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];

        if (sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3 && sumaFila3 == sumaColumna1
                && sumaColumna1 == sumaColumna2 && sumaColumna2 == sumaColumna3
                && sumaColumna3 == sumaDiagonal1 && sumaDiagonal1 == sumaDiagonal2) {
            System.out.println("Es un cuadrado mágico.");
        } else {
            System.out.println("No es un cuadrado mágico.");
        }
    }

    
}
