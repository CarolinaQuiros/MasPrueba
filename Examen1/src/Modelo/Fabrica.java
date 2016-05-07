/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.FramePersonas;

/**
 *
 * @author Carolina
 */
public class Fabrica {
    
    private Persona persona;
    
    public Persona getPersona(String estatus, String identidad, String procedencia, String paisOrigen, String paisActual, int cantidadDias){
        
        switch(estatus){
                case "Cuidadano":
                    cantidadDias = 30;
                    persona = new Cuidadano(estatus,identidad,procedencia,paisOrigen,paisActual,cantidadDias);
                 break;
                case "Indigena":
                    persona = new Indigena(estatus,identidad,procedencia,paisOrigen,paisActual,cantidadDias);
                    break;
                case "Migrante":
                    cantidadDias = 10;
                    persona = new Migrante(estatus,identidad,procedencia,paisOrigen,paisActual,cantidadDias);
                    break;
                case "Refugiado":
                    cantidadDias = 30;
                    persona = new Refugiado(estatus, identidad, procedencia, paisOrigen, paisActual,cantidadDias);
                    break;
            }
            return persona;
        }
    
}
