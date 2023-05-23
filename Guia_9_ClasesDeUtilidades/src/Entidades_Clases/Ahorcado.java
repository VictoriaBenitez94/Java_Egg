/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_Clases;

/**
 *
 * @author vbenitez
 */
public class Ahorcado {
    
    private String palabra;
    private String [] vector = new String[palabra.length()];

    public Ahorcado() {
    }

    public Ahorcado(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public String[] getVector() {
        return vector;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }
    
    
    
    
    
}
