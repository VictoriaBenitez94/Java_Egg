/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades_Clases.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vbenitez
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.nextLine();
        int dia, mes, anio;
        System.out.println("Ingrese el dia, mes y año");
        dia = leer.nextInt();
        mes= leer.nextInt();
        anio= leer.nextInt();
        Date nacimiento = new Date (anio-1900,mes-1, dia);
        return new Persona(nombre,nacimiento);
      
}

    public int diferencia (Persona persona){
        Date fecha = new Date();
       int diferencia = fecha.getYear() - persona.getNacimiento().getYear();
        //System.out.println("La edad de la persona es " + diferencia);
        return diferencia;
    }
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
    //persona es menor que la edad consultada o false en caso contrario.


   public boolean menorQue(Persona persona) {
       System.out.println("Ingrese su edad");
       int edad = leer.nextInt();
       return (diferencia(persona)< edad);
   }
   
   //Método mostrarPersona que muestra la información de la persona deseada.
   
   public void mostrarPersona(Persona persona){
       System.out.println("El nombre de la persona es: " + persona.getNombre());
       System.out.println("La edad de la persona es: " + diferencia(persona));
       
       System.out.println(menorQue(persona));
       
   }
}
    
    

