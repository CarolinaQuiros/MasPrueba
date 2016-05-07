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
    private int cantidadDias;

    public Migrante() {
    }

    public Migrante(String estatus, String identidad, String procedencia, String paisOrigen, String paisActual, int cantidadDias) {
        this.estatus = estatus;
        this.identidad = identidad;
        this.procedencia = procedencia;
        this.paisOrigen = paisOrigen;
        this.paisActual = paisActual;
        this.cantidadDias = cantidadDias;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
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
    
    @Override
    public String getEstatu(){
        return getEstatus();
    }
    
    @Override
    public String getIdentida(){
        return getIdentidad();
    }
    
    @Override
    public String getProcedenci(){
        return getProcedencia();
    }
    
    @Override
    public String getPaisOrige(){
        return getPaisOrigen();
    }

    public void setPaisActua(String pais) {
        this.paisActual = pais;
    }
}
