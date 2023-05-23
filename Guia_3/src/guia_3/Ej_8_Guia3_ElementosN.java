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
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si 
el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *


*/

public class Ej_8_Guia3_ElementosN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner Ej8 = new Scanner(System.in);
       
        System.out.println("Ingrese el tamaño del cuadrado:");
       
        int N = Ej8.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
           
            Ej8.close();
        }
    }    
        
        
        
    }
    

