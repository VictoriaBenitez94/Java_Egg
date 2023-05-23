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
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

*/

public class Ej_7_Guia3_SubstringEqualsLenght {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try (Scanner Ej7 = new Scanner(System.in)) {
            String cadena, letra;
            int correcto, incorrecto;
            correcto = 0;
            incorrecto = 0;
            do {
                System.out.print("ingrese un codigo valido\n");
                
                cadena = Ej7.nextLine();
                
                
                if (cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(4,5).equalsIgnoreCase("o") && cadena.length()==5 ) {
                    System.out.print("ingreso valido\n");
                    correcto += 1;
                } else if (cadena.equalsIgnoreCase("&&&&&"))
                    System.out.print("Salida exitosa\n");
                else {
                    System.out.print("ingreso NO valido\n");
                    incorrecto += 1;
                }
            } while (!cadena.equalsIgnoreCase("&&&&&"));
            System.out.print("Cantidad de correctos: "+ correcto + "\n");
            System.out.print("Cantidad de incorrectos: "+ incorrecto + "\n");
        }
    }
        
        
        
    }
    

