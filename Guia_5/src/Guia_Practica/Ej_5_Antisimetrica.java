/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Practica;

/**
 *
 * @author benit
 */
public class Ej_5_Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Realice un programa que compruebe si una matriz dada es
         * antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta
         * es igual a su propia traspuesta, pero cambiada de signo. Es decir, A
         * es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se
         * denota por AT y se obtiene cambiando sus filas por columnas (o
         * viceversa).
         */
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (10-Math.random() * 20) ;
            }
        }
        int[][] trans = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              
            trans[i][j] =  matriz[j][i];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("  ");            
        }
        System.out.println("  ");
        System.out.println("TRANSPUESTA");
        System.out.println("  ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(trans[i][j] + "  ");
            }
            System.out.println("  ");            
        }
    }
}
