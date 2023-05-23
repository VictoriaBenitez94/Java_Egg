/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_Clases;

import java.util.Arrays;

/**
 *
 * @author vbenitez
 */
public class mesSecreto {
    
    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    
    
    private String mesSecreto;

    public mesSecreto() {
    }

    public mesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "mesSecreto{" + "meses=" + Arrays.toString(meses) + ", mesSecreto=" + mesSecreto + '}';
    }
    
    
}

