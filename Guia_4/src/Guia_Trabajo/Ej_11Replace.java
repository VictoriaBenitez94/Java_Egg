/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_Trabajo;

import java.util.Scanner;
public class Ej_11Replace {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String frase;
        System.out.println("ingrese una frashoe");
        frase=sc.nextLine();
        trans(frase);
        
    }
    public static void trans(String frase){
        frase= frase.replace("a", "@");
        frase= frase.replace("e", "#");
        frase= frase.replace("i", "$");
        frase= frase.replace("o", "%");
        frase= frase.replace("u", "*");
        System.out.println("la frase modificada queda "+frase+".");
    }
}
