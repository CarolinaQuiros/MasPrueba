/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Carolina
 */
public class Migrante implements Persona {
    private String estatus;
    private String identidad;
    private String procedencia;
    private String paisOrigen;
    private String paisActual;

    public Migrante() {
    }

    public Migrante(String estatus, String identidad, String procedencia, String paisOrigen, String paisActual) {
        this.estatus = estatus;
        this.identidad = identidad;
        this.procedencia = procedencia;
        this.paisOrigen = paisOrigen;
        this.paisActual = paisActual;
    }


    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisActual() {
        return paisActual;
    }

    public void setPaisActual(String paisActual) {
        this.paisActual = paisActual;
    }
    
     public int dias() {
        return 10;
    }
}
