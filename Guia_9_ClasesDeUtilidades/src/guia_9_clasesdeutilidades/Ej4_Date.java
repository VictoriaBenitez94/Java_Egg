/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clasesdeutilidades;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author vbenitez
 */
public class Ej4_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FechaService fecha = new FechaService();
        
        Date nacimiento = fecha.fechaNacimiento();
        
        Date actual = fecha.fechaActual();
        
        fecha.diferencia(nacimiento, actual);
    
    }
    
}
