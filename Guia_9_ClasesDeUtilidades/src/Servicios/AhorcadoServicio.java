/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades_Clases.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author vbenitez
 */
public class AhorcadoServicio {
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahorcado = new Ahorcado();
    
    public void crearJuego(){
        System.out.println("Cargue la palabra a buscar");
       String palabra=leer.nextLine();
        System.out.println("Cargue la cantidad de intentos");
        int intentos = leer.nextInt();
       // ahorcado.setVector(vector[]=new String[palabra.length()]);
    // int intentos = leer.nextInt();
       String vector[] = new String [palabra.length()];
        
       for (int i = 0; i < palabra.length(); i++) {
            vector[i]=palabra.substring(i,i+1);
        }
    }
    
    public void longitud(String palabra, String [] vector){
        System.out.println("La longitud de la palabra a buscar es "+ palabra.length());
    }
    
    public void buscar(String palabra, String [] vector){
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.next();
        letra.charAt(0);
        for (int i = 0; i < palabra.length(); i++) {
            if (vector[i].equals(letra)){
                System.out.println("Letra encontrada");
                vector[i]= " ";
            }else{
             
                
                      
            }
        }
    }
    
            
}
