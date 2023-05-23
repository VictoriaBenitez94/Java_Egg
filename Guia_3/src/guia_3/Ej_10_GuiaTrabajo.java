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
public class Ej_10_GuiaTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           Scanner leer = new Scanner(System.in);

        int numero;
        int j = 0;

        do {
            numero = leer.nextInt();
            if (numero <= 20 && numero >= 0) {
                j = j + 1;
                System.out.print(numero + " ");
                for (int i = 0; i < numero; i++) {
                    System.out.print("*");
                } 
                

                System.out.println("");
            } else {
                System.out.println("El numero ingresado es mayor a 20");
                break;
            }
        } while (j < 4);

    }
    
}
