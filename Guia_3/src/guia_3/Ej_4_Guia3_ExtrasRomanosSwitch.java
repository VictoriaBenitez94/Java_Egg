/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

/**
 *
 * @author benit
 */
public class Ej_4_Guia3_ExtrasRomanosSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 
        y 10 
        y se muestre su equivalente en romano.
        */
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        
        num = leer.nextInt();
        
      switch (num) {
          case 1:
              
              System.out.println("El numero ingresado en romano es: I");
          break;
          case 2:
              System.out.println("El numero ingresado en romano es: II");
           break;
          case 3:
              
              System.out.println("El numero ingresado en romano es: III");
          case 4:
              
              System.out.println("El numero ingresado en romano es: IV");
            break;
            
         case 5:
              
              System.out.println("El numero ingresado en romano es: V");
            break;
            
        case 6:
              
              System.out.println("El numero ingresado en romano es: VI");
            break;
            
       case 7:
              
              System.out.println("El numero ingresado en romano es: VII");
            break;
            
       case 8:
              
              System.out.println("El numero ingresado en romano es: VIII");
            break;
            
            
            
        case 9:
              
              System.out.println("El numero ingresado en romano es: IX");
            break;
            
        
        case 10:
              
              System.out.println("El numero ingresado en romano es: X");
            break;
      }
        
    }
    
    
}
