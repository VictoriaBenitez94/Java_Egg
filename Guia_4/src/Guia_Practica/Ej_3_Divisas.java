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
public class Ej_3_Divisas {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double euro;
        System.out.println("digite cuantos euro quiere convertir");
        euro=sc.nextDouble();
        conversor(euro);
    }
    public static void conversor(double euro){
             int op;
        System.out.println("digite a que moneda quiere convertir" +
                "\n1.libra" +
                "\n2.dolar" +
                "\n3.yenes" +
                "\n4.salir");
        op= sc.nextInt();
        switch (op){
            case 1:
                euro=0.86*euro;
                System.out.println("los euros pasados a libras son: "+euro);
                break;
            case 2:
                euro=1.28611*euro;
                System.out.println("los euros pasados a dolar son: "+euro);
                break;
            case 3:
                euro=euro*129.852;
                System.out.println("los euros pasados ayenes son: "+euro);
                break;
            default:
                System.out.println("hasta luego");
        }
    }
}
