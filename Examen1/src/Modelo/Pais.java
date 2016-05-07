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
public class Pais {
    private String codigo;
    private int cupo;
    int cantSolicitudes;

    public Pais() {
    }

    public Pais(String codigo, int cupo, int cantSolicitudes) {
        this.codigo = codigo;
        this.cupo = cupo;
        this.cantSolicitudes = cantSolicitudes;
    }

    public int getCantSolicitudes() {
        return cantSolicitudes;
    }

    public void setCantSolicitudes(int cantSolicitudes) {
        this.cantSolicitudes = cantSolicitudes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    
    public void restarCupos(int uno){
        cupo = cupo-uno;
    }
    
}
