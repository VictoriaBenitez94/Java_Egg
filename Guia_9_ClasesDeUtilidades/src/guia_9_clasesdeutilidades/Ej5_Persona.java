/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clasesdeutilidades;

import Entidades_Clases.Persona;
import Servicios.PersonaService;


/**
 *
 * @author vbenitez
 */
public class Ej5_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);
        PersonaService persona = new PersonaService();
        Persona ente1 = persona.crearPersona();
        //System.out.println(ente1.toString());
        //persona.diferencia(ente1);
        //System.out.println("Ingrese la edad que desea comparar");
        //int edad = leer.nextInt();
        //System.out.println(persona.menorQue());
        
        persona.mostrarPersona(ente1);
        
        
        
    }
    
}
