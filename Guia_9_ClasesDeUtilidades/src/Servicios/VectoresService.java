/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades_Clases.Vectores;
import java.util.Scanner;

/**
 *
 * @author vbenitez
 */
public class VectoresService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

  
    public Vectores cargarAlumnos(){
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno"+ i+1+ ":");
            
        }
        return null;
    }
    
    
    
    
    public void crearCursos (){
    
           Vectores cursos = new Vectores();

           System.out.println("Ingrese el nombfe del curso");
           cursos.setNombreCursos(leer.nextLine());
           System.out.println("Ingrese la cantidad de horas por día: ");
             cursos.setCantidadPorDia(leer.nextInt());
            System.out.println("Ingrese la cantidad de día por semanas: ");
            cursos.setCantidadPorSemana(leer.nextInt());
            System.out.println("Ingrese el turno (mañana o tarde): ");
           cursos.setTurno(leer.nextLine());
            System.out.println("Ingrese el precio por hora : ");
            cursos.setPrecioPorHora(leer.nextDouble());
            cargarAlumnos();
        
        
    
           
           
          
                
    }
    
}
