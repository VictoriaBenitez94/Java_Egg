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
public class Vectores {
    
    private String nombreCursos;
    private int cantidadPorDia;
    private int cantidadPorSemana;
    private String turno;
    private double precioPorHora;
    public String [] alumno = new String [5];

    public Vectores() {
    }

    public Vectores(String nombreCursos, int cantidadPorDia, String turno, double precioPorHora) {
        this.nombreCursos = nombreCursos;
        this.cantidadPorDia = cantidadPorDia;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.cantidadPorSemana = cantidadPorSemana;
    }

    public int getCantidadPorSemana() {
        return cantidadPorSemana;
    }

    public String getNombreCursos() {
        return nombreCursos;
    }

    public int getCantidadPorDia() {
        return cantidadPorDia;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setNombreCursos(String nombreCursos) {
        this.nombreCursos = nombreCursos;
    }

    public void setCantidadPorDia(int cantidadPorDia) {
        this.cantidadPorDia = cantidadPorDia;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }

    public void setCantidadPorSemana(int cantidadPorSemana) {
        this.cantidadPorSemana = cantidadPorSemana;
    }
    
   
    
}
