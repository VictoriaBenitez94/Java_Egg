/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades_Clases.mesSecreto;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vbenitez
 */
public class mesSecretoService {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    mesSecreto ms =new mesSecreto();
    
    Random random = new Random();
    
    public String cargarMesSecreto(mesSecreto mes){
      //mes.setMesSecreto(mes.getMeses()[(int) Math.random()*12]);
       
      
       mes.setMesSecreto(mes.getMeses()[random.nextInt(11)]);  
       
       System.out.println(mes.getMesSecreto());

//mes.getMesSecreto()= random.nextInt(11);
        
        return mes.getMesSecreto();
    }
    
    
    public void adivinarMes (mesSecreto mes){
       String mesSecreto = cargarMesSecreto(mes);
        System.out.println("Adivine el mes, ingrese un mes: ");
        
        String mesUsuario =leer.nextLine();
        
        while   (!mesUsuario.toLowerCase().equals(mesSecreto)){
                System.out.println("Incorrecto, ingrese un mes nuevamente");
                mesUsuario= leer.nextLine();
                
        }
        
        System.out.println("Correcto");
    }
    
    
}
