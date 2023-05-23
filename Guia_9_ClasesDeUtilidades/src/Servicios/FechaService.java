/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vbenitez
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
    public  Date fechaNacimiento (){
        
        System.out.println("Ingrese dia, mes y año de su nacimiento");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio =leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        System.out.println(fecha);
       return fecha;
    }
    
    public Date fechaActual () {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        return fechaActual;
       
    }
    
    public int diferencia(Date fecha, Date fechaActual){
        int diferencia = fechaActual.getYear() - fecha.getYear();
        
        System.out.println("Diferencia en años en fechas=" + diferencia);
       
        return diferencia;
    }
    
    
}
